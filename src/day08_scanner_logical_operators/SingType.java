package day08_scanner_logical_operators;



/*
     Task:
        Declare and assign a number

        I want to know the sign of the number
            if the number positive
            is the number negative
            is the number 0
 */
public class SingType {
    public static void main(String[] args) {

        int num = 4;

        boolean isNegstive = num < 0;
        boolean isPositive = num > 0;
        boolean isZero = num == 0;
        boolean isNotZero = num != 0;

        System.out.println(num + "is negative :  " + isNegstive);
        System.out.println(num + "is positive : " + isPositive);
        System.out.println( num + " is zero" + isZero);
        System.out.println( num + " isnot zero" + isNotZero);

    }
}
