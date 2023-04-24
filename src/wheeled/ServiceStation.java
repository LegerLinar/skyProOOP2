package wheeled;

interface ServiceStation {
     void toService();

     default void checkEngine(){
        System.out.println("Проверяем двигатель");
        }

     default void checkTrailer(){
        System.out.println("Проверяем прицеп");
    }

    }

