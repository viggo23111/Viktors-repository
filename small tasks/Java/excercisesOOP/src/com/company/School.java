package com.company;

public class School {
    private String name;
    private Semester sem;

        public School(String name) {
            this.name = name;
            this.sem = new Semester();
        }


        public void printSchoolName() {
            System.out.println(name);
            sem.printStudents();
        }



}
