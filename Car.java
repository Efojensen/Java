public class Car extends Vehicle {
    private boolean isLuxury;
    private double additional;
    private static Customer primeCustomer;
    private double baseRentRate = 330.7;

    public Car(
        boolean isLuxury,
        String vehicleId,
        String vehicleName,
        boolean isAvailable
    ) {
        this.isLuxury = isLuxury;
        setAvailable(isAvailable);
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleType = VehicleType.CAR;
        this.additional = isLuxury ? 150 : 10;
        this.rent = calculateRentalCost(primeCustomer.daysToRent);
    }

    public Car(){

    }

    @Override
    boolean isAvailableForRental() {
        return isAvailable();
    }

    public void setCustomer(Customer currentCustomer){
        primeCustomer = currentCustomer;
    }

    @Override
    double calculateRentalCost(int days) {
        double ans = baseRentRate * days + additional;
        return ans;
    }

    public boolean isAvailable() {
        return super.isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        if (!isAvailable && !this.isAvailable()) {
            System.out.println("Vehicle is already unavailable");
            return;
        } else if (isAvailable && this.isAvailable()) {
            System.out.println("Vehicle is already available");
            return;
        }
        super.isAvailable = isAvailable;
    }

    public boolean getIsLuxury() {
        return isLuxury;
    }

    @Override
    public void rent(Customer customer, int days) {
        if (!this.isAvailable) {
            throw new UnsupportedOperationException("This car is not available for rent");
        }

        primeCustomer = customer;

        this.isAvailable = !this.isAvailable;
        System.out.println("Here's your " + this.vehicleName + "Have a lovely day");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Vehicle Name: " + this.vehicleName + "\tVehicle Type: " + this.vehicleType);
        System.out.println("Is available: " + this.isAvailable);

        if (!this.isAvailable){
            System.err.println("This car is not available for rent");
            return;
        }

        new RentalTransaction(primeCustomer);
    }
}