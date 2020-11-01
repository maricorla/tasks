package com.marina.generics;

import org.w3c.dom.ls.LSOutput;

public class BoxRunner {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setContent("String");

        b1.setContent2(7);

        System.out.println(b1);
    }



}
