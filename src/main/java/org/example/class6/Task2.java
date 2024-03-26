package org.example.class6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("your grade here");
        char grade=user.nextLine().toUpperCase().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
                case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("invalid");

        }
    }
}
