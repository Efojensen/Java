public class Car extends Vehicle implements Rentable{
    private boolean isLuxury;
    private double additional;
    private Customer primeCustomer;
    private double baseRentRate = 330.7;

    public Car(String vehicleName, boolean isLuxury, boolean isAvailable) {
        this.isLuxury = isLuxury;
        setAvailable(isAvailable);
        this.vehicleName = vehicleName;
        this.vehicleType = VehicleType.CAR;
        this.additional = isLuxury ? 150 : 10;
        this.rent = calculateRentalCost(primeCustomer.daysToRent);
    }


    @Override
    boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    double calculateRentalCost(int days) {
        double ans = baseRentRate * days + additional;
        return ans;
    }

    public boolean isAvailable(){
        return super.isAvailable;
    }

    public void setAvailable(boolean isAvailable){
        if (!isAvailable && !this.isAvailable()) {
            System.out.println("Vehicle is already unavailable");
            return;
        }else if (isAvailable && this.isAvailable()) {
            System.out.println("Vehicle is already available");
            return;
        }
        super.isAvailable = isAvailable;
    }

    public boolean getIsLuxury(){
        return isLuxury;
    }


    @Override
    public void rent(Customer customer, int days) {
        if (!this.isAvailable){
            throw new UnsupportedOperationException("This car is not available for rent");
        }

        primeCustomer = customer;

        this.isAvailable = !this.isAvailable;
        System.out.println("Here's your " + this.vehicleName + "Have a lovely day");
    }


    @Override
    public void returnVehicle() {
        new RentalHistory(primeCustomer);
    }

}