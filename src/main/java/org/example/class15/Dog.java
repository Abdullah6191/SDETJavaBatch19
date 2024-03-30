package org.example.class15;

public class Dog {
    String name;
    int age;
     void printName(){
         System.out.println(name);
     }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="jacky";
        d1.age=123;
        d1.printName();
    }
}
