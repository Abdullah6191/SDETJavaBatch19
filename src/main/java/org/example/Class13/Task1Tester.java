package org.example.Class13;

public class Task1Tester {
    public static void main(String[] args) {
        Task1 t1=new Task1();
        String email=t1.createEmail("Jhon","Snow",":gmail");
        if(email.contains("Jhon")){
            System.out.println("Good");
        }
        String str="JaVa";
        System.out.println(str.charAt(2));
    }
}
