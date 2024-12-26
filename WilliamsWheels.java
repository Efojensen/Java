import java.util.List;
import java.util.ArrayList;

public class WilliamsWheels {
    List<Vehicle> selectedType;
    Vehicle[] vehicles = new Vehicle[]{
        new Truck("712132", "Rambo", true),
        new Truck("792232", "El-Grande", false),
        new Truck("920912", "The Roadrunner", false),
        new Car(false,"672912", "Volkswagen", true),
        new Car(false, "345212", "Ford Pickup", false),
        new Car(true, "092429", "Nissan Expada", true),
        new Car(true, "902842", "Mercedes Benz", true),
        new Car(true, "583021", "Hyundai Elantra", true),
    };

    public void displaySelectedVehicles(Class<?> vehicleType) {
        selectedType = new ArrayList<>();
        int i = 1;
        System.out.println("\nSelected Vehicles (" + vehicleType.getSimpleName() + "):");
        for (Vehicle vehicle : vehicles) {
            if (vehicleType.isInstance(vehicle)) {
                selectedType.add(vehicle);
                System.out.println(i + ". " + vehicle.vehicleName);
                i++;
            }
        }
    }

    public void selectVehicle(int chosenVehicle, Customer customer){
        chosenVehicle -= 1;
        Vehicle selectedVehicle = selectedType.get(chosenVehicle);
        selectedVehicle.returnVehicle();
    }
}
