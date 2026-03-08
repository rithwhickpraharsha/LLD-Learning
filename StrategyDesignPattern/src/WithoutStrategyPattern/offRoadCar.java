package WithoutStrategyPattern;

public class offRoadCar extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving it in same sports mode");
        // This is not good as we are repeating the same code in
        //  both sports car and off road car. This is a violation of DRY principle.
    }
    
}
