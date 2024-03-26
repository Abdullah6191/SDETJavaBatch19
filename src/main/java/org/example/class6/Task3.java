package org.example.class6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers and operator");
        double num1= scan.nextDouble();
        double num2=scan.nextDouble();
        char operator=scan.next().charAt(0);

        switch (operator){
            case'+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("wrong number");
        }
    }
}
