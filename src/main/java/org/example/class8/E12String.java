package org.example.class8;

public class E12String {
    public static void main(String[] args) {
        String str="kjhgfdfedsfg0987654321!@@$#";
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));

    }
}
