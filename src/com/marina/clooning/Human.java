package com.marina.clooning;

public class Human implements Cloneable {
    private int age;
    private String name;
    private  String passport;
    public Car car;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Human(int age, String name, String passport, Car car) {
        this.age = age;
        this.name = name;
        this.passport = passport;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                ", car=" + car +
                '}';
    }

   @Override
    protected Human clone() throws CloneNotSupportedException {
        return (Human)super.clone();
    }

}
