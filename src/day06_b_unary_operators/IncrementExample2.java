package day06_b_unary_operators;

public class IncrementExample2 {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age);//20
        System.out.println(age++);// ---> 20
        System.out.println(age);// 21
        System.out.println(age++ +2);//23
        System.out.println(age);//22

        //23+2
        System.out.println(++age +2);//25 | age =23
        System.out.println(age);

    }
}
