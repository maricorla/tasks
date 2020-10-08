package com.marina.tasks;

public class ATM {

    public static void main(String[] args) {

        Banknote banknote = new Banknote(5,1,1);
        int summa1 = banknote.makeSum();
        System.out.println(summa1);

        banknote.addMoney(5,2,1);
        int summa2 = banknote.makeSum();
        System.out.println(summa2);
    }




    }

