package org.example.class5;

import java.util.Scanner;

public class E5ScannerChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your gender");
        char gender=scanner.next().charAt(0);
        System.out.println(gender);
    }
}
