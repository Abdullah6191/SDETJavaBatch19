package org.example.class11;

public class Task2 {
    public static void main(String[] args) {

//        INTERVIEW QUESTION
        String str = "hello";

        if (!str.isEmpty()) {

            if (str.length() % 2 != 0 && str.length() >= 3) {

                int middleindex=str.length()/2;
                System.out.println(str.charAt(middleindex));

            }
        }
    }
}