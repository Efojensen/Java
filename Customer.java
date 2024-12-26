public class Customer {
    public String name;
    public double amountPaid;
    public Vehicle chosenVehicle;

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
