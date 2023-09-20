package day08_scanner_logical_operators;
/*
       create a class called Speeding, and write a program to determines if the car is speeding

           declare 3 variables:
           current speed, speed limit, speeding boolean

           print
           "Are you speeding? " true/false
    */
public class Speeding {
    public static void main(String[] args) {
        double currentSpeed = 40;
        double speedLimit = 25;
        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("You are in school in zone. Are hyou speeding? "+ isSpeeding);
    }
}
