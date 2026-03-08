package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivingStrategy;

public class Vehicle {

    DrivingStrategy drivingStrategy;

    Vehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    public void drive() {
        drivingStrategy.drive();
    }
    
}
