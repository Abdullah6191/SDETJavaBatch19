package org.example.Class7And8;

public class Task11 {
    public static void main(String[] args) {
        int []numbers={20,30,50,60,70,80};
         int max=numbers [0];
         for(int n:numbers){
             if (max<n){
                 max=n;
             }
         }
        System.out.println(max);
    }
}
