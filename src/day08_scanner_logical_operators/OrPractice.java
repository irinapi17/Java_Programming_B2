package day08_scanner_logical_operators;

public class OrPractice {
    public static void main(String[] args) {
        int apples = 5;
        int oranges = 10;
        //                   true  || false ===========>t
        System.out.println(apples >1 || oranges < 5); // true
        //                     false   || true ===========>t
        System.out.println(apples >10 || oranges == 10); // true
      //                   false    && true               false
        System.out.println(apples >10 && oranges == 10); // false



        //Discounts are avaliable on weeeked AND teacher OR|| doctor
    }
}
