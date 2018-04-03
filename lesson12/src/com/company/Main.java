package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
      /*  ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(20);//такой же тип
        list.add(30);
        list.add(40);
      System.out.println(list.get(1));//возвращает 2й элемент
        list.remove(0);//удаляем 0й элемент
        System.out.println(list);
        Integer a=20;
        list.remove(a);
        System.out.println(list);
        list.set(1,50);
        System.out.println(list);

        for (int i=0;i<list.size();i++){
            int a=list.get(i);
            System.out.println(a);
        }*/


        HashMap<Integer,String>
                contacts=new HashMap<Integer,String>();
        contacts.put(258963,"Ivanov");
        contacts.put(1234569,"Petrov");
        contacts.put(123025,"Sidorov");
        System.out.println(contacts);
        System.out.println(contacts.get(123025));
        contacts.remove(123025);
        System.out.println(contacts);
    }
}
