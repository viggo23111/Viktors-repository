package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList <Customer> customers = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here
        customers.add(new Customer("Viktor","Nymand","viny"));
        customers.add(new Customer("Karl","Johan","kajo"));
        customers.add(new Customer("Morten","Knudsen","mokn"));
        customers.add(new Customer("Jesper","Larsen","jela"));
        customers.add(new Customer("Helge","Karlson","heka"));
        customers.add(new Customer("Lars","Søren","lasø"));
        printAllCustomers();
        System.out.println("Skriv kundes id: ");
        Scanner scan = new Scanner(System.in);
        int input =scan.nextInt();
        Customer cust = findCustomer(input);
        System.out.println(cust);
    }

    public static void printAllCustomers(){
        for(Customer c: customers){
            System.out.println(c);
        }
    }

    public static Customer findCustomer(int customerId) {
        Customer cust = new Customer();

        for(Customer c: customers){
            if(c.getId()==customerId){
                cust=c;
            }
        }
        return cust;
    }

}
