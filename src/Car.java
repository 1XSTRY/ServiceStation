public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        super.checkEngine();
        System.out.println("Проверяем двигатель автомобиля");
    }
}
