package org.example.review5;

public class E4_2dArrays {
    public static void main(String[] args) {
        //write code to add numbers which are above 50
        int [][] num={
                {10,20,30,40},
                {50,60,70,80},
                {45,52,89,77},

        };
        int sum=0;
        for (int i=0; i<num.length; i++){
            for (int j=0; j<num[i].length; j++){
                if (num[i][j]>50){
                   sum=sum+num[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
