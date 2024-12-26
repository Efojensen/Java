public class Customer {
    public String name;
    public int daysToRent;
    public double amountPaid;
    public Vehicle chosenVehicle;
    private double amountOnHand = 5000;

    public double getAmountOnHand(){
        return this.amountOnHand;
    }

    public Customer(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
