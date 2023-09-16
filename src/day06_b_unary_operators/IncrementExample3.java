package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i = 5;
        int z = i++; //i = i + 1;   z =  5    | i = 6
        System.out.println(z);
        System.out.println(i);

        int a = 10;
        int b = a + 1; // it is not the same as a++;
        System.out.println(a);//10
        System.out.println(b);//11

        int c = ++a;//
        System.out.println(c);//11
        System.out.println(a);//11

        int x = 10;
        x = x +1;
        System.out.println(x + 1);// how people use it ---> sout (++x + 1);

        System.out.println(x + 1);
        x= x + 1; // sout ( x++ +1 );



    }
}
