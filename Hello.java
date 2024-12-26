import java.util.Scanner;

public class Hello {
    public static void main(String args[]){
        System.out.println("Welcome to William's Wheels\n");
        System.out.println("Select your preferred vehicle\n");

        System.out.println("1. Motorcycle\t\t2. Car\t\t3. Truck");

        try (Scanner secondth = new Scanner(System.in)) {
            int chosen = secondth.nextInt();
            secondth.nextLine();

            System.out.println("Before proceeding please enter in these fields...\n");
            System.out.print("Name: ");
            String name = secondth.nextLine();
            secondth.nextLine();
            
            Customer current = new Customer(
                name
            );
            System.out.println("For how many days would you like to rent a vehicle?");

            int days = secondth.nextInt();
            current.daysToRent = days;

            Car sthElse = new Car();
            sthElse.setCustomer(current);

            WilliamsWheels willsWheels = new WilliamsWheels();

            switch (chosen) {
                case 1:
                    willsWheels.displaySelectedVehicles(Motorcycle.class);
                    break;
                case 2:
                    System.out.println("Select the car of your preference");
                    willsWheels.displaySelectedVehicles(Car.class);
                    willsWheels.selectVehicle(secondth.nextInt(), current);
                    break;
                case 3:
                    willsWheels.displaySelectedVehicles(Truck.class);
                    break;
                default:
                    break;
            }
        }
    }
}

