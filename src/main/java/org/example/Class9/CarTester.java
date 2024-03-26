package org.example.Class9;

public class CarTester {
    public static void main(String[] args) {

        Car toyota=new Car();

        toyota.make="Toyota";
        toyota.model="Crown";
        toyota.year=2024;
        toyota.price=43000;
        System.out.println(toyota.make);
        System.out.println(toyota.model);
        System.out.println(toyota.year);
        System.out.println(toyota.price);
        toyota.moveForward();
        toyota.applyBrakes();

        Car tesla=new Car();
        tesla.make="Tesla";
        tesla.model="V6";
        tesla.year=2024;
        tesla.price=50000;
        tesla.color="blue";
        System.out.println(tesla.make);
        System.out.println(tesla.model);
        System.out.println(tesla.year);
        System.out.println(tesla.price);
        System.out.println(tesla.color);

        tesla.moveForward();
        tesla.applyBrakes();

    }


}
