package org.example.class5;

import java.util.Scanner;
/*Write a program for user to enter his/hers birth month. Based on the month define the season.
        Example: if user is born in March, April, May → season =”Spring”
        if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season ______”.*/

public class Task8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month= scan.nextLine().toLowerCase();

    }
}
