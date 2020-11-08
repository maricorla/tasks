package com.marina.comparision;

public class Task3 {
    public static void main(String[] args) {
        int a = 50;
        int c = 0;

        try {
            System.out.println(calc(a, c));
        }catch (MarinaException exception){
            System.out.println("My exception");
            exception.printStackTrace();
        }


        }

    public static int calc(int a, int b) throws MarinaException{
        if(b==0){
            throw new MarinaException("No by 0");
        }
        return (int)a/b;
    }


}
