public class Truck extends Vehicle {
    public boolean forBusiness;
    private double baseRentRate = 540.5;

    public Truck(
        String vehicleId,
        String vehicleName,
        boolean isAvailable
    ){
        this.vehicleName = vehicleName;
        this.vehicleId = vehicleId;
        this.isAvailable = isAvailable;
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

    @Override
    public void rent(Customer customer, int days) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rent'");
    }

    @Override
    public void returnVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnVehicle'");
    }
}
