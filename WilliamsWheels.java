public class WilliamsWheels {
    Vehicle[] vehicles = new Vehicle[]{
        new Truck("Rambo", true, false),
        new Car("Volkswagen", false, true),
        new Car("Ford Pickup", false, false),
        new Car("Nissan Espada", true, true),
        new Car("Mercedes Benz", true, false),
        new Truck("El Grande", true, true),
        new Car("Hyundai Elantra", true, true),
        new Truck("The Roadrunner", false, true),
    };

    public void displaySelectedVehicles(Class<?> vehicleType) {
        System.out.println("\nSelected Vehicles (" + vehicleType.getSimpleName() + "):");
        for (Vehicle vehicle : vehicles) {
            if (vehicleType.isInstance(vehicle)) {
                System.out.println(vehicle.vehicleName);
            }
        }
    }
}
