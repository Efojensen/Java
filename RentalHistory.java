public class RentalHistory {
    public double amountPaid;
    public String customerName;
    public Vehicle vehicleRented;

    public RentalHistory(Customer customer) {
        this.customerName = customer.name;
        this.amountPaid = customer.amountPaid;
        this.vehicleRented = customer.chosenVehicle;
    }
}
