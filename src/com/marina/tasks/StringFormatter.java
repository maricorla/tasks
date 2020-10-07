package com.marina.tasks;

import java.util.Scanner;

public class StringFormatter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Insert number of URA");
        int counter = sc.nextInt();
        String result = String.format("Hello %s, URA %d volte",name,counter);
        System.out.println(result);

        double a = 5.9899889;
        System.out.println(String.format("Number: %.5f",a));
    }
}
