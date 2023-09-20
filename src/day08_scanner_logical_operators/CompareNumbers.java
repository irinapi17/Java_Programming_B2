package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
       int num1 =  input.nextInt();// we are getting info from the user and storing it in container / variable
        System.out.println("Enter number 2: ");
        int num2 =  input.nextInt();

        System.out.println( "Number is equal" + (num1 == num2));

    }
}
