public abstract class Vehicle {
    protected String vehicleId;

    protected boolean isAvailable;

    public enum VehicleType {
        CAR, TRUCK, MOTORCYCLE
    }

    protected double rent;

    protected String vehicleName;

    protected VehicleType vehicleType;

    abstract boolean isAvailableForRental();

    abstract double calculateRentalCost(int days);
}
