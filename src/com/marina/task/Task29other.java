package com.marina.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task29other {
    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArray.add((int) (Math.random() * 10));
        }

        System.out.println(myArray);

        Iterator <Integer> iterator = myArray.iterator();

        while(iterator.hasNext()){
            Integer currentNum = iterator.next();
            if(currentNum<6){
                iterator.remove();
            }
        }
        System.out.println(myArray);


    }
}
