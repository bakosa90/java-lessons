package com.company;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        /*Book b1=new Book();
        b1.setBookName("RRRRRRRR");
        b1.setAuthor("Lusy");
        Book b2=new Book();
        b2.setBookName("OOOOOO");
        b2.setAuthor("Tim");
        EBook b3=new EBook();
        b3.setBookName("YYYYY");
        b3.setAuthor("ENik");

        showAuthor(b1);
        showAuthor(b2);
        showAuthor(b3);

        int a=1;
        int b=a++ + ++a + a++;
       System.out.println(a);

        b1.author.setName("France");
        System.out.println(b1.getBookName());
    }
    public static void showAuthor(IBook b){
        System.out.println(b.getAuthor());

    }
*/
        Date d = new Date();
        System.out.println(d.getTime());//милисекунды c 1970

        Calendar c=Calendar.getInstance();
        System.out.println(c);

        //выводим день в году

        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        //какая дата будет через 6 месяцев

        c.set(Calendar.MONTH,6);
        System.out.println(c);

        //текущий год+5лет

        c.add(Calendar.YEAR,5);
        System.out.println(c);

        //какая дата было 5 лет назад
        c.add(Calendar.YEAR,-2);
        System.out.println(c);

        c.getTime();//получаем объект типа date


        GregorianCalendar gc=(GregorianCalendar)GregorianCalendar.getInstance();
        if(gc.isLeapYear(2020)){
            System.out.println("високосный");
        }
        else {
            System.out.println("не високосный");
        }

        DateFormat

    }
}
