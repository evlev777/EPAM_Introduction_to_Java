package OOP.carierarchy;

public abstract class Car {
    protected String brand;
    protected String model;
    protected String carID;
    protected String location;

    protected double fuelConsumption;
    protected double priece;
    protected double velocity;
    protected double maxCarryingWeight;

    protected int maxPassengers;
    protected int doors;

    protected boolean isLighton = false;


    protected Car(){

    }

    //    getter and setters


    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        carID = carID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPriece() {
        return priece;
    }

    public void setPriece(double priece) {
        this.priece = priece;
    }



    //        getters

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getMaxCarryingWeight() {
        return maxCarryingWeight;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isLighton() {
        return isLighton;
    }

    // methods


    void move (String destination){
        System.out.printf("%s has moved from %s to %s", carID, location, destination);
        System.out.println();
        location = destination;
    }

    void lightOn(){
        isLighton = true;
    }

    void lightOff(){
        isLighton = false;
    }


    double takePassengers (int passengersQty){
        if(passengersQty <= maxPassengers){
            return 0;
        }else
            return passengersQty-maxPassengers;
    }


    @Override
    public String toString(){
        return String.format("%s %s %s", brand, model, carID);
    }

}
