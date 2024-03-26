package org.example.class5;

import java.util.Scanner;

public class E1ScannerClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Scanner= is a non primative data type.
        scan= variable name.
        new Scanner(System.in)= creates an object of the scanner class.
         */
        System.out.println("Please enter your age:");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("you can go to brothell");
        }else{
            System.out.println("be smart and stay home and danda laraw!");
        }

    }
}
