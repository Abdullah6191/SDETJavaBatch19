package org.example.class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("what's your height?");
        Scanner scan=new Scanner(System.in);
        double height= scan.nextDouble();

            if (height<60) {
                System.out.println("short");

            }else if (height>=60 && height<=72){
                System.out.println("Medium");

            }else if (height>72){
                System.out.println("you are tall");
            }else{
                System.out.println("you are an alien");
            }

        }
    }


