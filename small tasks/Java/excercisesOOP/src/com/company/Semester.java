package com.company;

import java.util.ArrayList;

public class Semester {
    public String name;
    ArrayList<Student> students = new ArrayList<>();
    private Teacher teacher;

    public Semester() {
        name = "1. Semester";
        Teacher teacher = new Teacher("Jesper", 26);
        students.add(new Student("Kalle", 22));
        students.add(new Student("Bob", 22));
        students.add(new Student("Palle", 29));
        students.add(new Student("Ole", 90));
    }


    public void printStudents() {
        System.out.println("list of Students: " + students.size());

        for(int i = 0; i < students.size(); i++)
        {
            System.out.println("Name: " + students.get(i).getName() + " - Age: " + students.get(i).getAge());
        }

    }

    public ArrayList<Student> getStudents() {
        return students;
    }


}
