package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppConnection {
    public static Connection conn;
    public static void createConnection() throws ClassNotFoundException, SQLException {//для соединения с БД
        Class.forName("com.mysql.jdbc.Driver");//для подгрузки классов
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/app_db","admin","123098");//передаем параметры для подкл БД

    }
}
