package org.example.class15;

public class Task2 {

    public static String reverseStr(String str){
        return new StringBuilder(str).reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(Task2.reverseStr(""));
    }
}
