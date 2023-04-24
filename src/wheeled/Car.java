package wheeled;

public class Car  extends TyreMechanism{
    public Car(String name, byte wheelsCount) {
        super(name, wheelsCount);
    }

    @Override
    public void toService(TyreMechanism mechanism){
        super.toService(mechanism);
        if (this.getClass() == mechanism.getClass()) {
            checkEngine();
        }

    }
}