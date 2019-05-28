package OOP;

import OOP.carierarchy.Car;
import OOP.carierarchy.family.Hatchback;
import OOP.carierarchy.family.Sedan;
import OOP.carierarchy.family.Universal;
import OOP.carierarchy.minibus.CarrierCar;
import OOP.carierarchy.minibus.Transporter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarBuilder{
    List<Car> createCars (String fileadress) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileadress));
        List<Car> cars = new ArrayList<>();


        Map<String,Integer> carValueMap = new HashMap<>();

        if(reader.ready()){
            String carValues[] = reader.readLine().split(";");
            int counter = 0;

            for(String value : carValues){
                carValueMap.put(value,counter++);
            }
        }else
        {
            return cars;
        }

        while (reader.ready()){
            String carValues[] = reader.readLine().split(";");
            double maxCarryingWeight = Double.parseDouble(carValues[carValueMap.get("maxCarryingWeight")]);
            int maxPassengers = Integer.parseInt(carValues[carValueMap.get("maxPassengers")]);
            int doors = Integer.parseInt(carValues[carValueMap.get("doors")]);
            double velocity = Double.parseDouble(carValues[carValueMap.get("velocity")]);
            double fuelConsumption = Double.parseDouble(carValues[carValueMap.get("fuelConsumption")]);
            String carID = carValues[carValueMap.get("carID")];
            String model = carValues[carValueMap.get("model")];
            String brand = carValues[carValueMap.get("brand")];


            Car currentCar;
            double carPrice;
            if ( maxCarryingWeight > 1400 ) {
                if (maxPassengers > 20) {
                    currentCar = new Transporter(brand, model, carID,
                            fuelConsumption, velocity, maxCarryingWeight);

                } else {
                    currentCar = new CarrierCar(brand, model, carID,
                            fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
                }
                carPrice = 30000 + Math.random()*10000;

            } else {
                if (maxPassengers >= 7) {
                    currentCar = new Universal(brand, model, carID,
                            fuelConsumption, velocity, maxCarryingWeight, maxPassengers);
                    carPrice = 12500 + Math.random()*5000;




                } else {
                    if (doors == 4) {
                        currentCar = new Sedan(brand, model, carID,
                                fuelConsumption, velocity, maxCarryingWeight);
                    } else {
                        currentCar = new Hatchback(brand, model, carID,
                                fuelConsumption, velocity, maxCarryingWeight);
                    }
                    carPrice = 9000 + Math.random()*5000;


                }
            }

            currentCar.setLocation("Minsk");
            currentCar.setPriece(Math.round(carPrice*100)/100.0);
            cars.add(currentCar);
        }



        return cars;
    }
}
