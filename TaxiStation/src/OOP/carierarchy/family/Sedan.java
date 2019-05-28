package OOP.carierarchy.family;

public class Sedan extends FamilyCar {
    public Sedan (String brand, String model, String carID,
                     double fuelConsumption, double velocity,
                     double maxCarryingWeight) {
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = 5;
        this.doors = 4;
    }
}
