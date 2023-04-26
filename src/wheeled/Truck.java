package wheeled;

public class Truck extends TyreMechanism {


    public Truck(String name, int wheelsCount) {
        super(name, wheelsCount);
    }


    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void toService() {
        super.toService();
            checkEngine();
            checkTrailer();

    }
}
