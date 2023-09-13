package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);// 0

        x = x +1;//adding 1
        System.out.println(x);// 1
// in java there is a shorter way to write x+1 in two option
      /*  POST-INCEMENT
       x++; this will increase value by 1 */

        x++;
        System.out.println(x);//2
        x++;
        System.out.println(x);//3

        //PRE-INCREMENT
        ++x;
        System.out.println(x);//does the same thing 3+1=4

        //Q: what is the difference ? why we have  two versions?

        System.out.println(++x);//5 Pre- increment it will update x first and print it

        System.out.println(x++);// 5 POST- increment ---> it prints it first and updates it
        System.out.println(x);//6
    }
}
