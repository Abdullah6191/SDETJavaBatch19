package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your amount");
        double amount= scanner.nextDouble();
        if(amount<=200000){
            System.out.println("eligible to take loan");
        }else{
            System.out.println("you can't");
        }
    }
}
