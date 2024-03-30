package org.example.class8;

public class Task3 {
    public static void main(String[] args) {
        String fatherName="Matt";
        String motherName="Taylor";
        boolean isBoy=false;
        if(isBoy){
            String firstHalf=fatherName.substring(0,fatherName.length()/2);
            String lastHalf=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(firstHalf+lastHalf);
        }else{
            String firstHalf=motherName.substring(0,motherName.length()/2);
            String lastHalf=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(firstHalf+lastHalf);
        }
    }
}
