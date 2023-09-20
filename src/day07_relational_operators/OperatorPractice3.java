package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
        int h = 5; // I declared and int  variable called h and assing a value 5 to it
        int p = h;// i declared a variable p and assined a value from variable h

        h++;// post increment
        System.out.println("h "+ h);//output :6
        System.out.println("p " + p);//output:5

        int k = h++;//
        System.out.println("h" + h);//7
        System.out.println("p" + k);//6

        int g = ++h;
        System.out.println("h" + h);//8
        System.out.println("g" + g);//8


    }
}
