package wheeled;

public class Truck extends TyreMechanism {

    public String modelName;
    public int wheelsCount;

    public Truck(String name, byte wheelsCount) {
        super(name, wheelsCount);
    }


}
