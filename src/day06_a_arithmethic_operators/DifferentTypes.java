package day06_a_arithmethic_operators;

public class DifferentTypes {
    public static void main(String[] args) {
        // both are int ---> int and int
        System.out.println(10 - 5);
        System.out.println(10 * 5 );

        System.out.println(10.0 / 5);//double
        // one side is double and inather int ---> tskes higther number data type

        System.out.println(10.0 / 5.0);// both double

        System.out.println(10.0 / 5 );
        System.out.println((int)10.0 / 5);// casting to int makes int answer 2
        System.out.println((double)10 / 5);// casting  int to double takes higther number and make it double

        byte b1 = 10;
        byte b2 = 20;
/*
        byte sum = b1 +  b2; WRONG will give issue
        b1 + b2 automaticly counts as int(during calculation) and can not be assined to byte
        [this is happens to short and byte types]

so correct way to put it is
 */
        int sum1 = b1 + b2 ; //works normal

        byte sumByte = (byte)(b1 + b2);// works
        System.out.println(sum1);
        System.out.println(sumByte);
    }
}
