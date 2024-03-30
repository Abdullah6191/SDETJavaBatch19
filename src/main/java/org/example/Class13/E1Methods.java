package org.example.Class13;

public class E1Methods {

    void sayHello(String country) {
        switch (country.toLowerCase()) {
            case "usa":
                System.out.println("Hello!");
                break;
            case "france":
                System.out.println("Bonjour!");
                break;
            case "germany":
                System.out.println("Guten Tag!");
                break;
            case "japan":
                System.out.println("Konnichiwa!");
                break;
            case "china":
                System.out.println("Nǐ hǎo!");
                break;
            default:
                System.out.println("Invalid input");
        }//end of switch




    }

    public static void main(String[] args) {
        E1Methods e1=new E1Methods();
        e1.sayHello("USA");
    }
}
