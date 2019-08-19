package car_dealership;

public class Employee {

    // SET THE PROPERTIES AND MAKE THEM PRIVATE FOR ENCAPSULATION.
    private String firstName;
    private String lastName;
    private String department;
    private int empNum;

    //SET THE CONSTRUCTOR


    public Employee(String firstName, String lastName, String department, int empNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.empNum = empNum;
    }

    // CREATE THE SETTERS AND GETTERS
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    //CREATE THE METHODS.

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if(finance == true){
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        }else if(vehicle.getPrice() <=cust.getCashOnHand()){
            processTransaction(cust,vehicle);
        }else{
            System.out.println("The customer needs more money if they want "+vehicle);
        }

    }
    public void runCreditHistory(Customer cust, double loanAmount){
        System.out.println("Ran credit history for customer");
        System.out.println("Customer has been approved");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer purchased "+vehicle+" for the price of "+vehicle.getPrice());
    }

}




