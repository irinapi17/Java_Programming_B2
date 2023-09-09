package day03_comments_escape_sequence;

public class Quote {
    public static void main (String [] args){

        /* Q: How can I  output the following

        I like "Java" programming

         */

        // there is some symbols that are the part of the SYNTAX(grammer)
        // which we can not use dirrectly
        System.out.println("I like \"Java\" programming");

        //Single quote is used as a part of the Java Syntax as well
        System.out.println("I like 'Java' programming");
        // if I want to put a / use double
        System.out.println("I like \\Java\\ programming");


    }
}
