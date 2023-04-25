package wheeled;

public class Car  extends TyreMechanism implements ServiceStationCheckEngine{
    public Car(String name, int wheelsCount) {
        super(name, wheelsCount);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void toService(){
        super.toService();
            checkEngine();

    }
}