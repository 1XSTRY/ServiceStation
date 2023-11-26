public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем транспортное средство " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем грузовик " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем велосипед " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
