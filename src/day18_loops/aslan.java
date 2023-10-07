package day18_loops;

public class aslan {


    public static void main(String[] args) {

        String msg = "abcloopabccampabcteachesabcusabcjavaabcclassesabc";


        while (msg.contains("abc")) {
            int a = msg.indexOf("abc"),
                    c = a + 2;
            msg = msg.substring(0,a) + msg.substring(c + 1);

        }
    }

}