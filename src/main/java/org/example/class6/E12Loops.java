package org.example.class6;

import java.util.Scanner;

public class E12Loops {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("enter the starting point");
        int start= user.nextInt();
        while(start<10){
            System.out.println(start);
            start++;
        }

    }
}
