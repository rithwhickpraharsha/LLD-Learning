package WithStrategyPattern;

import WithStrategyPattern.Strategy.DrivingStrategy;
public class OffRoad extends Vehicle {
    
    public OffRoad(DrivingStrategy drivingStrategy) {
        super(drivingStrategy);
    }
    
}
