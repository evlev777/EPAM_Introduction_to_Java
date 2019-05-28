package OOP.carierarchy.minibus;

import OOP.interfaces.BigPassengerOrder;

public class Transporter extends MiniBusCar implements BigPassengerOrder {
    public Transporter(String brand, String model, String carID,
                          double fuelConsumption, double velocity, double maxCarryingWeight) {
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = 25;
    }
}
