package class3;

public class Task6 {
    public static void main(String[] args) {
        double mortageRate=3;
        double mortagePrice=150000;
        if(mortageRate<=4.5){
            System.out.println("user will buy a house");
            if (mortagePrice>100000){
                System.out.println("user will take a loan");
            }else{
                System.out.println("user will buy the house in cash");
            }


        } else{
            System.out.println("user will not buy the house");
        }
    }
}
