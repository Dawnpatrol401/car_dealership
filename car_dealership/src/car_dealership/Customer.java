package car_dealership;

public class Customer {

    //SET THE CUSTOMERS PROPERTIES
    private String firstName;
    private String lastName;
    private String address;
    private double cashOnHand;




    //CREATE CONSTRUCTOR

    public Customer(String firstName, String lastName, String address, double cashOnHand) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }


    //GETTERS AND SETTERS

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    //OTHER METHODS
    public void purchaseCar(Vehicle vehicle,Employee emp, boolean finance){
        emp.handleCustomer(this,finance,vehicle);
    }
}


