package day37_a_abstraction.car;

public class Toyota extends Car {
    @Override
    public void start(){
        System.out.println("Insert KEY");
        System.out.println("Turn the KEY");
    }
}