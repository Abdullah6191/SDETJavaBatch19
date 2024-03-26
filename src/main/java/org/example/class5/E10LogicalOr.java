package org.example.class5;

public class E10LogicalOr {
    public static void main(String[] args) {
        double bankBalance=50000;
        double cash=40000;
        if(bankBalance>30000||cash>30000){
            System.out.println("i can buy a toyota");
        }else{
            System.out.println("i need to save more");
        }
    }
}
