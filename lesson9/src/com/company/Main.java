package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
	/*Settings s=new Settings();
	s.posX=100;
	s.posY=200;
	s.fullSScreen=false;

	User u=new User();
	u.name="Georgiy";
	u.avatar="img/1.png";

	System.out.println(s);
	System.out.println(u);

	    //Сериализация (брать объект и записывать его без изменений):

		FileOutputStream fos=new FileOutputStream("app.bin");//
		//создали (файл) выходной поток (текст-текстовый поток, не текст-бинарный поток)
		ObjectOutputStream oos=new ObjectOutputStream(fos);//писавть в файл объекты
		oos.writeObject(s);
		oos.writeObject(u);
		//закрываем все потоки (последнее закрываем первым)-зеркально
		oos.close();
		fos.close();

		//Десериализация

		FileInputStream fis=new FileInputStream("app.bin"); //путь к открываемому файлу-потоку
		ObjectInputStream ois=new ObjectInputStream(fis); //передаем параметры-записываем в файл
		//читаем объеты в файле Settings(к кот хотим преобразовать тип Object)-тк несовпадение типов
		Settings s1=(Settings) ois.readObject();
		//читаем объеты в файле User
		User u1=(User)ois.readObject();
		//закрываем файлы-потоки
		ois.close();
		fis.close();

		System.out.println(s1);
		System.out.println(u1);

		//процессыъ
		//потоки

		//сколько времени выполняется кщд
		long t=System.currentTimeMillis();//возвращает время на момент объявления переменнойв миллисекундах
		for (int i=0;i<10000000;i++){
			//рез-т работы матем функций-не имеет смысла-для загрузки процессора
			double d=Math.sin(i*2)+Math.pow(i,3)-Math.sqrt(i/2);
			}
			System.out.println(System.currentTimeMillis()-t);//выводим сколько времени длится цикл
		//рез-т:10468

		//создаем поток1
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				//внутри объекта переопределяем метод!-ананимный объект!!
				for (int i=0;i<5000000;i++){
					//рез-т работы матем функций-не имеет смысла-для загрузки процессора
					double d=Math.sin(i*2)+Math.pow(i,3)-Math.sqrt(i/2);
				}
			}
		});

		//создаем поток2

		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				//внутри объекта переопределяем метод!-ананимный объект!!
				for (int i=500000;i<10000000;i++){
					//рез-т работы матем функций-не имеет смысла-для загрузки процессора
					double d=Math.sin(i*2)+Math.pow(i,3)-Math.sqrt(i/2);
				}
			}
		});
		//запуск потоков
		t1.start();
		t2.start();
		System.out.println(System.currentTimeMillis()-t);//выводим сколько времени длится цикл
		//рез-т: 0

		t1.join();//преостанавливаем работу основного процесса, пока поток t1 не выполнится
		t2.join();//затем выполняется поток t2
		//затем выполняется основной поток
		*/


		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				//внутри объекта переопределяем метод!-ананимный объект!!
				for (int i=0;i<1000000000;i++){
					update(1);
					}
			}
		});

		//создаем поток2

		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				//внутри объекта переопределяем метод!-ананимный объект!!
				for (int i=0;i<1000000000;i++){
				update(-1);
				}
			}
		});

		//запуск потоков
		t1.start();
		t2.start();

		t1.join();//преостанавливаем работу основного процесса, пока поток t1 не выполнится
		t2.join();

		System.out.println(n);

    }

	public static int n=0;//n-разделяющая переменная
	    public static synchronized void update(int d){
			//synchronized-синхронизируем потоки-выполняется ДВА потока, но образется очередь!
    	n+=d;
	}

}

