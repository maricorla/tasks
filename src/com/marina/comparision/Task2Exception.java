package com.marina.comparision;

import java.util.ArrayList;
import java.util.List;

public class Task2Exception {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(9);

        try {
            for (int i = 0; i <= ints.size(); i++) {
                System.out.println("my number " + ints.get(i));
            }
        }catch (IndexOutOfBoundsException exception){
            System.err.println("catch");
            exception.printStackTrace();
        }

        System.out.println("after catch" + ints.size());




        }


    }

