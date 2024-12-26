public class RentalTransaction {
    public double amountPaid;
    public String customerName;
    public Vehicle vehicleRented;

    public RentalTransaction(Customer customer) {
        this.customerName = customer.name;
        this.amountPaid = customer.amountPaid;
        this.vehicleRented = customer.chosenVehicle;
    }
}
