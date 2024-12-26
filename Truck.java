public class Truck extends Vehicle {
    public boolean forBusiness;
    private double baseRentRate = 540.5;

    public Truck(String vehicleName, boolean forBusiness, boolean isAvailable){
        this.vehicleName = vehicleName;
        this.isAvailable = isAvailable;
        this.forBusiness = forBusiness;
        this.vehicleType = VehicleType.TRUCK;
    }

    @Override
    double calculateRentalCost(int days) {
        double ans = baseRentRate * days;
        return ans;
    }

    @Override
    boolean isAvailableForRental() {
        throw new UnsupportedOperationException("Unimplemented method 'isAvailableForRental'");
    }
}
