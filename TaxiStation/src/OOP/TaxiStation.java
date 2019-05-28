package OOP;

import OOP.CarBuilder;
import OOP.carierarchy.Car;

import java.io.IOException;
import java.util.List;

public class TaxiStation {
    public List<Car> getCarPool() {
        return carPool;
    }

    List<Car> carPool;

    String fileadress;

    public TaxiStation (String fileadress) throws IOException{
        this.fileadress = fileadress;

        this.carPool = new CarBuilder().createCars(fileadress);
    }



}
