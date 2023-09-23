package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        System.out.println(" Enter your browser: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String  browser = input.nextLine();// i case we have mult words

        System.out.println("Enter your URL : ");// URL it is a link in browser
        String url = input.nextLine();
        switch(browser){
            case"chrome" :
                System.out.println("opening " + url + " in the " + browser+ "browser");
                System.out.println("Loading...");
                break;
            case "Edge":
                System.out.println("opening " + url + " in the " + browser+ "browser");
                System.out.println("Loading...");
                break;
            case "Safari" :
            case "safari" :
            case "SAFARI" :
            case "SafARI" :
                System.out.println("opening " + url + " in the " + browser+ "browser");
                System.out.println("Welcome");
                break;
            case "firefox" :
                System.out.println("opening " + url + " in the " + browser+ "browser");
                System.out.println("Welcome");
                break;
            default :
                System.out.println(browser + " is not a valid browser");
        }

    }
}
