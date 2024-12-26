import java.util.Scanner;

public class Hello {
    public static void main(String args[]){
        System.out.println("Welcome to William's Wheels\n");
        System.out.println("Select your preferred vehicle\n");
        System.out.println("1. Motorcycle\t\t2. Car\t\t3. Truck");
        try (Scanner secondth = new Scanner(System.in)) {
            int chosen = secondth.nextInt();
            WilliamsWheels willsWheels = new WilliamsWheels();
            switch (chosen) {
                case 1:
                    willsWheels.displaySelectedVehicles(Motorcycle.class);
                    break;
                case 2:
                    willsWheels.displaySelectedVehicles(Car.class);
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

