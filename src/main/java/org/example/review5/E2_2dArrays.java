package org.example.review5;

public class E2_2dArrays {
    public static void main(String[] args) {
        String[][] names={

                {"James","Ihab","Ana"},
                {"Zarina","Teona","Manu"},
                {"Will","Barkat","Olga"}
        };
        /*System.out.println(names[0][0]);
        System.out.println(names[0][1]);
        System.out.println(names[0][2]);
        System.out.println(names[1][0]);

         */
        for (int row=0; row<3; row++){

            for(int col=0; col<3; col++){
                System.out.println(names[row][col]+" ");
            }
            System.out.println();
        }

    }
}
