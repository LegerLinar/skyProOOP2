package wheeled;

public class TyreMechanism implements Serviced {
 private final String modelName;
 private final int wheelsCount;

    public TyreMechanism(String name, int wheelsCount) {
        this.modelName = name;
        this.wheelsCount = wheelsCount;
    }


    public void updateTyre(){
        for (byte wheel = 0; wheel < this.wheelsCount; wheel++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void toService() {
        System.out.println("Обслуживаем " + this.modelName);
        updateTyre();
    }

}
