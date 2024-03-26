package org.example.class5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your time");
        double time= scan.nextDouble();
        if(time>=1 && time<=11){
            System.out.println("Good MOrning");
        }else if(time>=12 && time<=15){
            System.out.println("good afternoon");
        }else if(time>=16 && time<=20){
            System.out.println("good evening");
        }else if(time>=21 && time<=24){
            System.out.println("good night");
        }else{
            System.out.println("invalid");
        }
    }
}
