package org.example.Class7And8;

public class E7Break {
    public static void main(String[] args) {
        String [] names={"james","Iram","Ali","Lere","Bombo","hatti"};
        // search for the name Ali if it is present print on the console name is present
        String name="Ali";

        for(String n:names){
            if(n.equals(name)){
                System.out.println(n+" is present");
                break;
            }
        }

    }
}
