package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        Customer obj1 = new Customer("Meghali","XYZ","megha@gmail.com",1234567890,false);
        obj1.displayCustomer();

        Customer obj2 = new Customer();
        obj2.displayCustomer();
        Customer temp = obj1;
        obj1 = obj2;
        obj2 = temp;
        System.out.println("No Argument");
        obj1.displayCustomer();

        System.out.println("Argument");
        obj2.displayCustomer();


    }
}
