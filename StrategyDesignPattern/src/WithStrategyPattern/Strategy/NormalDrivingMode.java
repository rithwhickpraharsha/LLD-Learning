package WithStrategyPattern.Strategy;

public class NormalDrivingMode implements DrivingStrategy {
    
    public void drive() {
        System.out.println("Driving the vehicle in normal mode");
    }
    
}
