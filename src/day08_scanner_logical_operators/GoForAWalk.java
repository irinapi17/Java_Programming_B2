package day08_scanner_logical_operators;

public class GoForAWalk {
/*
task I want to go for a walk

if it is not raining
if temp is above 70

 */
    public static void main(String[] args) {
        boolean isRaining = false;
        int temp = 60;

        System.out.println(" Do I need to go for a walk " + (!isRaining && temp > 70));
        //                                                                 relational operator has higher  priority
    }
}
