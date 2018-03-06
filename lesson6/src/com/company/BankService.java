package com.company;

public class BankService {
    public static void confirmPin(String pin) throws Exception {
        if (!pin.equals("1232")){     //то же, что if(pin.equals("1232")==false){
            throw new Exception("Не верный пин");
        }
    }

    public static int balance=100000;
    public static int getBalance(){
        return balance;
    }

    public static void getCash(int sum) throws Exception {
        if (sum>balance){
            throw new Exception("Не достаточно средств!");
        }
        balance-=sum; //balance=balance-sum;
    }

    }

