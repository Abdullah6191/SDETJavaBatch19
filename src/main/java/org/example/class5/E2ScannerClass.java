package org.example.class5;

import java.util.Scanner;

public class E2ScannerClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter byte number");
        byte smallBox=scanner.nextByte();
        System.out.println("please enter double number");
        double bigBox=scanner.nextDouble();
        System.out.println("please enter a boolean value");
        boolean logicBox=scanner.nextBoolean();

        System.out.println(smallBox);
        System.out.println(bigBox);
        System.out.println(logicBox);

    }
}
