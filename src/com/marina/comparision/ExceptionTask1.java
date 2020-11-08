package com.marina.comparision;

public class ExceptionTask1 {
    public static void main(String[] args) {

       String value = null;
       try {
           value.length();
       }catch (NullPointerException exception){
          exception.printStackTrace();
        }
    }

}
