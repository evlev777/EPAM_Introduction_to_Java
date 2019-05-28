package OOP.carierarchy.minibus;

import OOP.interfaces.BigParcelOrder;

public class CarrierCar extends MiniBusCar implements BigParcelOrder {
    public CarrierCar(String brand, String model, String carID,
                      double fuelConsumption, double velocity,
                      double maxCarryingWeight,  int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = maxPassengers;
    }
}
