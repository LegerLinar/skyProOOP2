package wheeled;

public class Truck extends TyreMechanism {


    public Truck(String name, int wheelsCount) {
        super(name, wheelsCount);
    }

    @Override
    public void toService() {
        super.toService();
        if (this.getClass() == Truck.class){
            checkEngine();
            checkTrailer();
        }
    }
}
