package day08_scanner_logical_operators;


public class LogicalOperators {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(n >5);// true
        System.out.println(n < 10); //false

        System.out.println(n >5 && n < 10); // 5 < n < 10;
        //                 true     false

        //20 is more than 5 AND 20 is less than 10 --- Does not sound right  -->false

        System.out.println(n > 5 || n < 10);
             //             true    false
        // 20 is more than 5 OR 20 is less than 10 ----> true

        System.out.println(4 > 3 || false); //t
        System.out.println(3 < 4 || false);//t
        System.out.println(3 > 4 || false);//f


        System.out.println(!false);//t
        System.out.println(!true);//f

       // System.out.println(4! =4); //false

        System.out.println(4 > 3 || false ||4 > 3 || false );
        //                   true    false  ||  true   false
        //                      true        || true false
        //                              true || false
        //                                   true
    }
}
