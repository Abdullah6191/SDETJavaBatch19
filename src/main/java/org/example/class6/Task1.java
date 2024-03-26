package org.example.class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("Enter your country");
        String country= user.nextLine();

        switch (country){
            case "USA":
                System.out.println("we speak in english");
                break;
            case "Spain":
                System.out.println("we speak espanol");
                break;
            case "Bangladesh":
                System.out.println("we speak in Bangla");
                break;
            default:
                System.out.println("country not supported");
                }

        }
    }

