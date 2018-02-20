import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* int age=18;
        if (age>=16) {
        System.out.println("Вы можете сдать на права!!!");
        }
        else {
        System.out.println("Вы не можете сдавать на права!!!");
        } */
       /* int month=14;
        switch (month){
            case 1:
                System.out.println("Январь");
            case 2:
                System.out.println("Февраль");
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует!!!");
        } */
       /* int i=0;
       while (i<10) {
           i=i+1;
           System.out.println(i);
           if (i==5) {
           break;
           }*/
      /* int a=10;
       do {
           System.out.println("Hello");
       }
       while (a<5); */

      /* for (int i=0;i<10;i=i+1) {
      System.out.println(i*i);
      }*/
       /* for (int i=0;i<10;i=i+1) {
            System.out.println(Math.pow(i,3));
               }*/

      // Чтение данных
        Scanner s=new Scanner(System.in);
        System.out.println("Введите Ваш рост в метрах");
        float height=s.nextFloat();
        System.out.print("Ваш рост в дюймах:");
        System.out.println(100*height/2.54);

        float usd=convertBYNtoUSD(10.5f);
        System.out.println(usd);

           }
    static float convertBYNtoUSD(float sum) {
        float usd=sum/1.96f;
        return usd;
    }
        }




