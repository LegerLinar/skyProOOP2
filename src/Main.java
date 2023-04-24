import wheeled.Bicycle;
import wheeled.Car;
import wheeled.Truck;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("bike1", 2);
        Bicycle bicycle2 = new Bicycle("bike2", 2);
        Car car = new Car("Car1", 4);
        Car car2 = new Car("Car2", 4);
        Truck truck = new Truck("Truck1", 6);
        Truck truck2 = new Truck("Truck2", 8);

        bicycle1.toService();
        bicycle2.toService();
        car.toService();
        car2.toService();
        truck.toService();
        truck2.toService();

    }
}