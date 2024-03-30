package org.example.class15;

public class Task1 {
    int sumArray(int [] arr){

        int sum=0;
        for (int i=0; i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Task1 t=new Task1();

    }
}
