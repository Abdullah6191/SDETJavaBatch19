package org.example.Class10;

public class BankUserTester {
    public static void main(String[] args) {

        BankUser abdullahObj=new BankUser();
        abdullahObj.userName="Abdullah01";
        abdullahObj.password="287346!";
        abdullahObj.age=23;
        abdullahObj.balance=5000;

        System.out.println(abdullahObj.userName);
        System.out.println(abdullahObj.password);
        System.out.println(abdullahObj.age);
        System.out.println(abdullahObj.balance);

        abdullahObj.deposit();
        abdullahObj.transeferFunds();
        abdullahObj.withdrawing();




    }
}
