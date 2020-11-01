package com.marina.task;

import java.util.ArrayList;
import java.util.List;

public class TaskMarks {
    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            myArray.add((int)(Math.random()*10));
        }

        System.out.println(myArray);

        for (int i = myArray.size()-1; i >0 ; i--) {
            if(myArray.get(i) <6){
                myArray.remove(myArray.get(i));
            }
            System.out.println(myArray);

        }
        System.out.println(myArray);


    }
}
