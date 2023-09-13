package day06_a_arithmethic_operators;


public class CastingExample {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne; // short is smaller than float , so implisit casting happens
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println();

        float num3 = 100.5F;
        short num4 =(short)num3;// float is bigger, so we ust explicity cast it, narrowing casting
        System.out.println(num3);
        System.out.println(num4); // losing desimal

        float num5 = 300;
        byte num6 = (byte)num5;
        short num7 = (short)num5;
        System.out.println(num5);//300.0
        System.out.println(num6);//range -128 --->127
        System.out.println(num7);// range

        char letter = 'A';
        int letterInt = letter;
        System.out.println(letter);
        System.out.println(letterInt);

        //you can cast it in print statement too
        System.out.println((int) letter);
        int let2 = 66;
        char let3 = (char)let2;
        System.out.println(let3);

        System.out.println((char)66);// B derectly casting in print statement
        System.out.println((int)'&');





    }
}
