package com.marina.task;

import java.util.ArrayList;
import java.util.List;

public class Task29 extends Student {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Marina"));
        students.add(new Student("Pasha"));
        students.add(new Student("Petya"));
        students.add(new Student("Vasya"));
        students.add(new Student("Kolya"));
        students.add(new Student("Olya"));

        System.out.println(students);

        for (int i = 0; i<students.size(); i++) {
            int mark = students.get(i).getMark();
            if(mark<=5){
                students.get(i).setMark(-1);
            }
        }
        System.out.println(students);

    }

}
