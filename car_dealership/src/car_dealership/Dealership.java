package car_dealership;

import java.util.Currency;
import java.util.EnumMap;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom","Seizemore","99 Methiscool ave",99);
        Employee emp1 = new Employee("Pauly","Shore","Sales",1);
        Vehicle veh1 = new Vehicle("BMW","M3","2000",98998);

        cust1.purchaseCar(veh1,emp1,false);

        Vehicle car = new Vehicle("BMW","M3","2000",98998);

        boolean twoIdenticalCars = car.equals(veh1);
        System.out.println(twoIdenticalCars);





    }


}

