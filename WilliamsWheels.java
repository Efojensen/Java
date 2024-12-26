import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class WilliamsWheels {
    List<Vehicle> selectedType;
    Customer check;
    Vehicle[] vehicles = new Vehicle[]{
        new Truck("712132", "Rambo", true),
        new Truck("792232", "El-Grande", false),
        new Truck("920912", "The Roadrunner", false),
        new Car(false, "672912", "Volkswagen", true),
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

        if (!selectedVehicle.isAvailable){
            return;
        }

        double cost = selectedVehicle.calculateRentalCost(customer.daysToRent);
        System.out.println("Would you like to purchase " + selectedVehicle.vehicleName + " at $" + cost + "?");
        System.out.print("Y/N: ");
        String ans;
        try (Scanner input = new Scanner(System.in)) {
            ans = input.next().toLowerCase();
        }

        do {
            if (ans.equals("y")){
                double amount = customer.getAmountOnHand();
                if (amount < cost) {
                    System.out.println("Insufficient funds to complete transaction");
                    return;
                }

                customer.setAmountOnHand(cost);
                System.out.println("Successfully purchased " + selectedVehicle.vehicleName + " at " + cost +".");
                System.out.println("Total funds left: " + customer.getAmountOnHand());
            }else if (ans.equals("n")) {
                System.out.println("Come again another time.");
                return;
            } else {
                System.out.println("Please choose a valid option.");
                try (Scanner input = new Scanner(System.in)){
                    ans = input.next().toLowerCase();
                }
            }
        } while (!ans.equals("y") && !ans.equals("n"));
    }
}
