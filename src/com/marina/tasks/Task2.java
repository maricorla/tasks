package com.marina.tasks;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        String test = "test";
        for (int i = 0; i<15;i++){
           test = test+i;
            System.out.println(test);
            Thread.sleep(100);

        }
    }

}
