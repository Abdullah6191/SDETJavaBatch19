package org.example.class5;

import java.util.Scanner;

public class E6ScannerBufferreader {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter your age");
        int age= scanner.nextInt();

        System.out.println("Enter your name");
        scanner.nextLine(); //we will use buffer reader method after primative data type value
        String name=scanner.nextLine();

        System.out.println("enter your price");
        int price= scanner.nextInt();

        System.out.println("enter your address");
        scanner.nextLine(); //we will use buffer reader method after (primative data type value
        String address=scanner.nextLine();

        System.out.println("Your name is "+name+" you are "+age+" years old "+price+" "+address);
    }
}
