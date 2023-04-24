package wheeled;

public class Bicycle extends TyreMechanism {

    public Bicycle(String name, byte wheelsCount) {
        super(name, wheelsCount);
    }

    @Override
    public void toService(TyreMechanism mechanism) {
        super.toService(mechanism);
    }
}