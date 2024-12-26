import java.util.List;
import java.util.ArrayList;

public class WilliamsWheels {
    List<Vehicle> selectedType;
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
        selectedType = new ArrayList<>();
        System.out.println("\nSelected Vehicles (" + vehicleType.getSimpleName() + "):");
        for (Vehicle vehicle : vehicles) {
            if (vehicleType.isInstance(vehicle)) {
                selectedType.add(vehicle);
                System.out.println(vehicle.vehicleName);
            }
        }
    }

    public void selectVehicle(){

    }
}
