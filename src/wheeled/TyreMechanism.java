package wheeled;

public class TyreMechanism implements ServiceStation{
 private String modelName;
 private final byte wheelsCount;

    public TyreMechanism(String name, byte wheelsCount) {
        this.modelName = name;
        this.wheelsCount = wheelsCount;
    }


    public void updateTyre(TyreMechanism mechanism){
        for (byte wheel = 0; wheel < mechanism.wheelsCount; wheel++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void toService(TyreMechanism mechanism) {
        System.out.println("Обслуживаем " + mechanism.modelName);
        updateTyre(mechanism);
    }

}
