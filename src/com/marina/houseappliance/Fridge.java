package com.marina.houseappliance;

public class Fridge extends BigInstrument implements MagicFunction{

    public Fridge(String nameOfInstrument, String model) {
        super(nameOfInstrument, model);
    }

    @Override
    public void switсhOnInSocket() {
        System.out.println("Fridge on");

    }

    @Override
    public void switcOffFromSocket() {
        System.out.println("Fridge off");
    }

    @Override
    public void coolFunction() {
        System.out.println("frezee immediately");

    }
}
