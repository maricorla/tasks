package com.marina.houseappliance;

public abstract class BigInstrument implements BaseClassHouseInstrument
{

    private String nameOfInstrument;
    private String model;

    public BigInstrument(String nameOfInstrument, String model) {
        this.nameOfInstrument = nameOfInstrument;
        this.model = model;
    }

    public String getNameOfInstrument() {
        return nameOfInstrument;
    }

    public void setNameOfInstrument(String nameOfInstrument) {
        this.nameOfInstrument = nameOfInstrument;
    }

    void riseTemp(int temp){
        System.out.println("rise the temp to " + temp);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
