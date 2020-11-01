package com.marina.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task30 {
    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myArray.add((int) (Math.random() * 10));
        }

        System.out.println(myArray);

        Set<Integer> check = new HashSet<>(myArray);
        System.out.println(check);


    }
}
