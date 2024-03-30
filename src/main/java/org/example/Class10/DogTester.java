package org.example.Class10;

public class DogTester {
    public static void main(String[] args) {
        /*
        we have created a variable dogObj which has a data type dog...
        we are creating the object of Dog and we are storing it in dogObj1 Variable
         */
        Dog dogObj1=new Dog();
        dogObj1.name="Jimmi";
        dogObj1.breed="German";
        dogObj1.color="Black";
        dogObj1.age=4;
        dogObj1.weight=20;

        System.out.println(dogObj1.name);
        System.out.println(dogObj1.breed);
        System.out.println(dogObj1.color);
        System.out.println(dogObj1.age);
        System.out.println(dogObj1.weight);

        dogObj1.bark();

        /*
        another dog
         */
        Dog dog2=new Dog();
        dog2.name="bob";
        dog2.color="white";
        dog2.breed="bullDog";
        dog2.age=10;
        dog2.weight=15;
            System.out.println(dog2.name);
            System.out.println(dog2.color);
            System.out.println(dog2.age);

            dog2.sleep();


    }
}
