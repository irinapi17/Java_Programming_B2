package day05_variables;


public class CharExample {
    public static void main(String[] args) {


        //assing characters to char data type


        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo); //takes as numbers  97 + 90---> 187


        char letterThee = 65;
        System.out.println(letterThee); // prints Letter A
        // char letterFour = '65'; ---> gives error because there is 2 characters


        System.out.println(letterOne + letterTwo + letterThee + numberOne + specialOne);
        System.out.println(letterOne + " " + letterTwo + " " + letterThee + " " + numberOne + " " + specialOne);
        System.out.println( "chars: " + letterOne +  letterTwo +  letterThee + numberOne +  specialOne);// concationation aza9..
        System.out.println(letterOne + letterTwo + "chars: " + letterThee  + numberOne  + specialOne);// concationation 187chars: a9$
        // CONCATINATION HAPPENS AFTER FIRST STRING
        System.out.println(letterOne + letterTwo + "chars: " + letterThee + numberOne + "chars: " + specialOne);

    }
}
