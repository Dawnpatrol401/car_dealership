package car_dealership;

import java.util.Objects;

public class Vehicle {

        //SET THE PROPERTIES AND MAKE THEM PRIVATE FOR ENCAPSULATION
        private String make;
        private String model;
        private String year;
        private double price;

        //SET THE CONSTRUCTOR

    public Vehicle(String make, String model, String year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    //SET THE GETTERS AND SETTERS

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override

    //this method will allow the system to print out the actual name of the vehicle rather than what it is stored as.
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", price=" + price +
                '}';
    }


    //Need to look more into these over rides.  I dont fully understand them.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.price, price) == 0 &&
                Objects.equals(make, vehicle.make) &&
                Objects.equals(model, vehicle.model) &&
                Objects.equals(year, vehicle.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, price);
    }
}






