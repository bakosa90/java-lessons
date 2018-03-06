package com.company;

import java.util.Scanner;

public class Bancomat {

    public static void showMainMenu(){
        Scanner s=new Scanner(System.in);
        System.out.println("Добро пожаловать!");
        while (true){
            System.out.println("1.Вставьте карточку");
            System.out.println("2.Услуги банка");
            System.out.print("Ваш выбор: ");
            int item;
            try{
                item=s.nextInt();
                s.nextLine();
            }
            catch (Exception e){
                System.out.println("Неверный выбор.Повторите попытку!");
                s.nextLine();
                continue;
            }
            switch (item){
                case 1:
                    System.out.println("Введите пин:");
                    String pin=s.next();  //почитали пин кот ввели
                    if(checkPin(pin)){
                       showCardActionsMenu();
                   return;
                    }
                case 2:
                    showBankServicesMenu();
                    return;
                    default:
                        System.out.println("Неверный ввод.Повторите попытку!");
            }
        }
    }

    public static boolean checkPin(String pin){
        try {
            BankService.confirmPin(pin);
        } catch (Exception e) {
           System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


    public static void  showCardActionsMenu(){
      Scanner s=new Scanner(System.in);
        int item=0;
      while(true){
          if (item==0){
              System.out.println("1.Просмотреть текущий счет");
              System.out.println("2.Выдача наличных");
              System.out.println("3.Назад");
              try {
                  item = s.nextInt();
                  s.nextLine();
              } catch (Exception e) {
                  System.out.println("Не вверный ввод.Повторите попытку");
                  s.nextLine();
                  continue;
              }
          }
              switch (item){
                  case 1:
                      int balance=BankService.getBalance();
                      System.out.print("Ваш баланс составляет: ");
                      System.out.println(balance);
                      break;
                  case 2:
                      System.out.println("Введите сумму: ");
                      int sum;
                      try {
                          sum=s.nextInt();
                          s.nextLine();
                      }
                      catch (Exception e){
                          System.out.println("Некорректная сумма");
                          s.nextLine();
                          continue;
                      }
                      try {
                          BankService.getCash(sum);
                          System.out.println("Ваш баланс: ");
                          System.out.println(BankService.getBalance());
                      } catch (Exception e) {
                          System.out.println(e.getMessage());
                          break;
                      }
                      break;
                  case 3:
                      showMainMenu();
                      return;

              }
              item=0;
      }
    }

    public static void showBankServicesMenu(){
        System.out.println("Справочная информация");
        System.out.println("Для возврата в главное меню нажмите любую кнопку.");
        Scanner s=new Scanner(System.in);
        s.next();
        s.nextLine();
        showMainMenu();
    }

}
