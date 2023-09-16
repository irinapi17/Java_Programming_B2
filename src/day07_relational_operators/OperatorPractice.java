package day07_relational_operators;


import java.sql.SQLOutput;

public class OperatorPractice {
    public static void main( String [] args) {
        int num = 10;
        num++; // post-increment | no other code, just incremented by 1|

        System.out.println(num);//11
        num--;//post-decrement
        System.out.println(num);//10

        System.out.println(num++);//post incremet --> we get the value first than update it | num is 11;
        System.out.println(num++);//output -->  11| num 12;
        System.out.println(++num);//output 13, we update it first , than use it ---> 13;| print --13



    }
}
