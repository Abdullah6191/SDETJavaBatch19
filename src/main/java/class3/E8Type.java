package class3;

public class E8Type {
    public static void main(String[] args) {
        double num=10.5;
        int number=(int)num; //narrowing concept. all are same: narrowing manual explicit
        System.out.println(number);


        int num1=10;
        float number1=num1;
        System.out.println(num1); //widening concept. all are same name: widening automatic implicit


        // issue for narrowing only...widening run the code without any error or issues.
    }
}
