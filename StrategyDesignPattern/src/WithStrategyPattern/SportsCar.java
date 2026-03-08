package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivingStrategy;

public class SportsCar extends Vehicle {
    
    public SportsCar(DrivingStrategy drivingStrategy) {
        super(drivingStrategy);
    }
    
}
