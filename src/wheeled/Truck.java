package wheeled;

public class Truck extends TyreMechanism implements ServiceStationCheckEngine, ServiceStationCheckTrailer {


    public Truck(String name, int wheelsCount) {
        super(name, wheelsCount);
    }


    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void toService() {
        super.toService();
            checkEngine();
            checkTrailer();
    }
}
