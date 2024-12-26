public class Car extends Vehicle implements Rentable{
    private boolean isLuxury;
    private double additional;
    private double baseRentRate = 330.7;

    public Car(String vehicleName, boolean isLuxury, boolean isAvailable) {
        this.isLuxury = isLuxury;
        setAvailable(isAvailable);
        this.vehicleName = vehicleName;
        this.vehicleType = VehicleType.CAR;
        this.additional = isLuxury ? 150 : 10;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rent'");
    }


    @Override
    public void returnVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnVehicle'");
    }

}