package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat=new Cat();
	cat.name="Vasya";
	//cat.age=10;
   //cat.sleep(4);
   //cat.sleep(10,25);
    cat.color="grey";
    cat.Voice();
    String s="Melarossa";
       //приведение к нижнему регистру
        s.toLowerCase();
    String lc=s.toLowerCase();
    System.out.println(lc);
    //приведение к верхнему регистру
        System.out.println(s.toUpperCase());
        //нахождение номера символа в строке
        System.out.println(s.indexOf("r"));
        //найти последний номер символа а
        System.out.println(s.lastIndexOf("a"));
        //выделить из строки часть символов и вывести начиная с этого номера
        System.out.println(s.substring(4));
        //вывести с какого по какой символ вывести
        System.out.println(s.substring(2,6));
        //сравнение двух строк не зависимо от регистров
        if (s.equalsIgnoreCase("MeLarOSSa")) {
            System.out.println("Строки равны");
        }
        //получить длину строки
        System.out.println(s.length());


        String f=String.format("Меня зовут %s. \nЯ люблю спать\t%d часов","Sveta",8);
        System.out.println(f);

        }
}
