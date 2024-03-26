package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);


        System.out.println("do you have a credit card?");
        String haveCreditCard=scanner.nextLine();
        if(haveCreditCard.equalsIgnoreCase("yes")){
            System.out.println("what is the balance on your card");
             int balance= scanner.nextInt();


             if (balance<1000){
             System.out.println("spend more");

         }else {
                 System.out.println("pay it");
             }
             }else{
             System.out.println("take a card");
         }
    }
}
