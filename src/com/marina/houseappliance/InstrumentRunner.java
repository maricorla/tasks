package com.marina.houseappliance;

public class InstrumentRunner {

    public static void main(String[] args) {
       /* Microwave myMicrowave = new Microwave("Microvawe", "LG", 12);
        myMicrowave.switсhOnInSocket();
        myMicrowave.cookFood();
        System.out.println((myMicrowave.getModel()).toString());
        System.out.println((myMicrowave.getWeight()));
        myMicrowave.riseTemp(180);
        myMicrowave.coolFunction();*/

        Fridge myfrigo = new Fridge("Fridge", "LG");
        System.out.println(myfrigo.getModel());
        System.out.println(myfrigo.getNameOfInstrument());

        myfrigo.coolFunction();
        BigInstrument check = new Fridge("Magiv","NNN67");
        String name = check.getNameOfInstrument();
        ((Fridge)check).coolFunction();
    }
}
