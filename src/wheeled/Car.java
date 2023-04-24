package wheeled;

public class Car  extends TyreMechanism{
    public Car(String name, int wheelsCount) {
        super(name, wheelsCount);
    }

    @Override
    public void toService(){
        super.toService();
        if (this.getClass() == Car.class) {
            checkEngine();
        }

    }
}