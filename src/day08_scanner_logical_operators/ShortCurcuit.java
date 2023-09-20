package day08_scanner_logical_operators;

public class ShortCurcuit {
    public static void main(String[] args) {
      /*
      -------------------
        T && T  ---->t     I care about second part
        F   && T -----> f   I do not care about second part
        t   && f ----> f
        F && F ----> F      I do not care about second part


        int a =10;
        Sout(false && (a++ >11))
                      this side will not be executed
  NOW Will be executed    Sout(false & (a++ >11));

       ------------------
        -------------------
        F || F  ---->false
        F   || T -----> t
        t   || f ----> t
        true || true ----> True  ---> if the first part  is True , 2nd part doesn't matter


*** NOTE
IF we want still the 2nd expression (2nd side), instead of &&, || ----> we can use & |
       */

       // System.out.println(true || 5\0 == 0);
       // System.out.println(true | 5\0 == 0);// you can not devide to 0
       // System.out.println(false && 5/0 == 0);
       // System.out.println(false & 5/0 == 0);//error

    }
}
