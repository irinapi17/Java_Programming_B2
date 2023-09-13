package day06_a_arithmethic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 40;
        int i = b; //The byte value is auto converted to int, because byte is smaller than int

        System.out.println(b);
        System.out.println(i);

        //int i2 = 100;
       // byte b2 = i2;
        // can't do like this cause byte is smaller than this int
// int is bigger we must cast it , we cast int type i2 to a byte type using below SYNTAX
        int i2 = 100;
        byte b2 = (byte)i2;
        System.out.println(i2);
        System.out.println(b2);

        int i3 = 500;
        long b3 = i3;
        // I am going from small ---> big int is smaller than long, so it will automatically CAST
        System.out.println(i3);
        System.out.println(b3);


        long l2 =200;
        int i4 = (int)l2;// casting
        System.out.println(l2);
        System.out.println(i4);

        double d = 50;//sout 50.0
        int i5 = (int)d;
        System.out.println(d);
        System.out.println(i5);

        double d2 = 40;
        byte b4 = (byte)d2;
        System.out.println(d2);
        System.out.println(b4);

        // with the numbers outsie the range DATA LOSS
        int i6 = 200;
        byte b5 =(byte)i6;
        System.out.println(i6);
        System.out.println(b5);// -56 loss of the data
        double d3 = 45.56;
        int i7 = (int)d3;
        System.out.println(d3);
        System.out.println(i7);






    }
}
