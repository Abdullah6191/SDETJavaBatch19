package org.example.review5;

public class E3_2dArrays {
    public static void main(String[] args) {
        int [][] num={
                {10,20,30,40},
                {50,60,70,80},
                {45,52,89,77},

        };
        for (int i=0;i<4;i++){
            for (int j=0; j<3; j++){
                System.out.print(num[j][i]+" ");
            }
        }
        System.out.println();
    }
}
