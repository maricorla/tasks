package com.marina.houseappliance;

import java.sql.SQLOutput;

public class Microwave extends BigInstrument implements InstrumentForCook {

    private int weight;

    public Microwave(String nameOfInstrument, String model, int weight) {
        super(nameOfInstrument, model);
        this.weight = weight;
    }

    public Microwave(String nameOfInstrument, String model) {
        super(nameOfInstrument, model);
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void switсhOnInSocket() {
        System.out.println("Microvawe switched on in socket");

    }

    @Override
    public void switcOffFromSocket() {
        System.out.println("Microvawe switched off in socket");
    }

    @Override
    public void cookFood() {
        System.out.println("Microvawe warm food");

    }


}