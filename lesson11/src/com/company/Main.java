package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        //подключаем библиотеку
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //подключаем файл к БД
        Connection conn=null;
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","admin","123098");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //создадим объект в кот содержится откомпелированный запрос
        try {
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM users");
            //ResultSet-получаем таблицу
            //ResultNext-получаем данные с новой строки
            ResultSet result=ps.executeQuery();//если SELECT-на выполнеие отправляет запрос; в ост.случаях- .executeUpdate
            while (result.next()){
                System.out.println(result.getInt("id"));
                System.out.println(result.getString("name"));//подбираем максимально схожие типы у IJ с SQL
                System.out.println(result.getString("reg_date"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //напишем запрос на добавление данных в БД
        try {
            PreparedStatement ps=conn.prepareStatement("INSERT INTO users (name,login,password,reg_date) VALUES (?,?,?,NOW())");
            ps.setString(1,"Vasya");
            ps.setString(2,"vasya@mail.ru");
            ps.setString(3,"12345");
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
