package com.company;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    static int counter=1;

    public Customer(String firstName, String lastName,String userName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.id=counter;
        counter++;
    }

    public Customer() {

    }

    @Override
    public String toString() {
        return "Customer: " +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", id = " + id + '}';
    }

    public int getId() {
        return id;
    }
}
