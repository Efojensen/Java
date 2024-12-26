public class Motorcycle extends Vehicle{
    public boolean isSporty;
    private double baseRentRate = 90;

    public Motorcycle(String motorCycleName, boolean isSporty) {
        this.isSporty = isSporty;
        this.vehicleName = motorCycleName;
    }

    @Override
    boolean isAvailableForRental() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAvailableForRental'");
    }

    @Override
    double calculateRentalCost(int days) {
        double ans = baseRentRate * days;
        return ans;
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
