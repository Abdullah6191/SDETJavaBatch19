package org.example.class6;

import java.util.Scanner;

public class E14Class {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        System.out.println("enter the starting point");
        int start= user.nextInt();
        System.out.println("enter the end point");
        int end= user.nextInt();
        System.out.println("enter your step size");
        int stepSize= user.nextInt();
        while(start<=end){
            System.out.println(start+" ");
            start=start+stepSize;
        }
    }}
