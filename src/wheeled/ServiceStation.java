package wheeled;

interface ServiceStation {
    public void toService(TyreMechanism mechanism);

    public default void checkEngine(){
        System.out.println("Проверяем двигатель");
        }
    }

