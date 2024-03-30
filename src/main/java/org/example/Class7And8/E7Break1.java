package org.example.Class7And8;

public class E7Break1 {
    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50,60};

        for (int num:numbers){
            if (num>50){
                continue;
            }
            System.out.println(num+10);
            System.out.println(num*10);
            System.out.println(num/10);
            System.out.println(num%10);
            System.out.println(num*20);
            System.out.println("*****");
        }
    }
}
