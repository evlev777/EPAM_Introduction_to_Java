package OOP.carierarchy.family;

import OOP.interfaces.MediumOrder;

public class Universal extends FamilyCar implements MediumOrder {
    public Universal (String brand, String model, String carID,
                         double fuelConsumption, double velocity,
                         double maxCarryingWeight, int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = maxPassengers;
        this.doors = 5;
    }
}
