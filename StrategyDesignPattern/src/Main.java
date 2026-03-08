import WithStrategyPattern.OffRoad;
import WithStrategyPattern.SportsCar;
import WithStrategyPattern.Strategy.DrivingStrategy;

public class Main {
    public static void main(String[] args) {
        // Vehicle vehicle = new SportsCar();
        // vehicle.drive();

        // Vehicle vehicle2 = new offRoadCar();
        // vehicle2.drive();

        // even though both of these methods are same we are
        //  duplicating the code

        DrivingStrategy sportMode = new WithStrategyPattern.Strategy.SportModeDriving();
        SportsCar sportsCar = new SportsCar(sportMode);
        sportsCar.drive();
        OffRoad offRoad = new OffRoad(sportMode);
        offRoad.drive();
        // this way we are reusing the same code
        //  and we are not violating DRY principle.

    }
}
