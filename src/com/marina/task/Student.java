package com.marina.task;

public class Student {

    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Student(String name) {
        this.name = name;
        setRandomMark();
    }

    public Student() {
        this.name = "pupu";
        this.mark = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setRandomMark(){
        int randMark = (int)(Math.random()*10);
        setMark(randMark);
    }

    @Override
    public String toString() {
        return '\n' + "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark + "}";
    }
}
