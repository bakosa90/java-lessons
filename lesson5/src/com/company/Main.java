package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	User u=new User();
	u.id=1;
	u.login="user@mail.ru";
	System.out.println(u.toString());

        User u2=new User();
        u2.id=1;
        u2.login="user@mail.ru";
        if (u.equals(u2)){
            System.out.println("u=u2");
        }
        else {
            System.out.println("u!=u2");
        }


        if(u==u2){
            System.out.println("u==u2");
        }
        else {
            System.out.println("u!=u2");
        }

        User u3=u2;
        u3.id=100;
        System.out.println(u2);
        System.out.println(u3);


        User u4=new User();
        u4.id=200;
        u4.login=u2.login;
        System.out.println(u2);
        System.out.println(u4);


        User u5=new User(10,"somelogin@mail.ru");
        System.out.println(u5);

	//ИСКЛЮЧЕНИЯ

        //int a=10/0;

        //ОТЛАВЛИВАЕМ ИСКЛЮЧЕНИЯ

        try { //ArithmeticException
            //ArrayIndexOutOfBoundsException

            //сключительная ситуация
        }
        catch (ArithmeticException e1){
        }
        catch (ArrayIndexOutOfBoundsException e2){
        }
        catch (Exception e3){
        //на всякий пожарный!
        }


        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.print("Введите целое число");
            try {
                s.nextInt();//ез-т записываем в переменную
                System.out.println("Ура!Вы ввели все верно!");
                break;
            }
            catch (Exception e){
                System.out.println("Не верный ввод!Повторите попытку!");
                System.out.println(e.getMessage());//выводим сообщение почему ошибка
                s.nextLine();
            }
        }

    }
}
