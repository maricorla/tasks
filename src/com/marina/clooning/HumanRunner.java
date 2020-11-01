package com.marina.clooning;

import org.w3c.dom.ls.LSOutput;

public class HumanRunner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car mazda = new Car("MAZDA", "656","red");

        Human vasya = new Human(30,"Вася", "MP999999", mazda);
        System.out.println("Our Vasya " + vasya);

        Human clone = vasya.clone();
        System.out.println("Clone of Vasya " + clone);

        clone.getCar().setBrand("Dodge");
        clone.getCar().setColor("Black");

        System.out.println("Our Vasya " + vasya);
        System.out.println("Clone of Vasya " + clone);

       // clone.setPassport("NOne");



    }

}
