package org.example.class5;

import java.util.Scanner;

public class E4ScannerClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.nextLine();
        System.out.println(name);
    }
}
