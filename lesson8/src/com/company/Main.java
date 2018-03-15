package com.company;

import java.io.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	/*User u1=new User("user","user@mail.ru");

		u1.message=new Message();
		u1.message.text="HelLo";
		u1.message.time=new Date();

		User u2=new User(u1);
		System.out.println(u2.login+" "+u2.name);


		User u3=null; //объект приравниваем к 0
		 try {
			u3=u1.clone();//alt+enter
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(u3.login+" "+u3.name);

		System.out.println(u3.login+" "+u3.name+" "+u3.message.text);*/

		File f=new File("1.txt");
		if(!f.exists()){
			try {
				f.createNewFile();//alt+enter
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//скрыт ли файл
		if(f.isHidden()){
			System.out.println("файл скрыт");
		}

//устанавливаем файл только для чтения
		//f.setWritable(false);


		//проверка можно ли читать и писать в файл
		if(!f.canWrite()){
			System.out.println("файл не доступен для записи(только чтение)");
		}

		//вывести инфу про дату изменения файла
		System.out.println(f.lastModified()); //время(мc),начиная с 1 января 1970 года

		//показать изменен 1970год в проводнике
		f.setLastModified(0);


		//удалить файл
		//f.delete();

		//переименовываем старый файл
		File f2=new File("2.txt");
		f.renameTo(f2);


		File dir=new File("test\\");
		if(!dir.exists()){
			dir.mkdir();
		}

		//возвращает массив строк
		dir.list();
		String files[]=dir.list();
		for(int i=0;i<files.length;i++){
			System.out.println(files[i]);
		}

		//записываем инфу в файл
		try {
			PrintWriter pw=new PrintWriter("1.txt","UTF-8");
			pw.write("Hello world!");//записываем текст в файл 1.txt
			pw.append("!!!!");
			pw.close();//оставляет файл для записи в дальнейшем
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}


		int fact(int n) {
			if (n <= 1) {
				return 1;
				return n*fact(n - 1);
			}

		}


    }


}
