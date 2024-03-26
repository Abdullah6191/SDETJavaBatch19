package org.example.class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a day");
        int day= scan.nextInt();
        if(day>=1 && day<=5) {
            System.out.println("it's a weekday");
        }else if(day>5 && day<=7){
            System.out.println("it's a weekend");

            } else{
        System.out.println("invalid day");
    }
    }
}
