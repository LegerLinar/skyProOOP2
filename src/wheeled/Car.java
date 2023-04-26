package wheeled;

public class Car  extends TyreMechanism{
    public Car(String name, int wheelsCount) {
        super(name, wheelsCount);
    }


    @Override
    public void toService(){
        super.toService();
            checkEngine();

    }

    private void checkEngine(){
        System.out.println("Проверяем двигатель");
    }
}