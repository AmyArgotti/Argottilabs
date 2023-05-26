import com.fasterxml.jackson.databind.ObjectMapper;
import enums.*;
import enums.Color;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private LinkedList<Car> cars;

    public Inventory(){
        cars = new LinkedList();
    }
    public void addCarToInventory(Color color, Engine engine, Model model, Transmission transmission, Type type, Double price) {
        Car car = new Car(color, engine, model, transmission, type, price);

        cars.add(car);
    }

    // new general method
    public void addCarToInventory(Car a) {
        cars.add(a);
    }

    public LinkedList<Car> getCars(){
        return this.cars;
    }

    public Car search(Car searchedCar){
        // in the case you need to edit the search algorithm the changes need to go here
        // or you may create more methods and return the cars by conditions
        for(Iterator i = cars.iterator(); i.hasNext();){
            Car car = (Car) i.next();

            if(searchedCar.getColor() != car.getColor()){
                continue;
            }

            if(searchedCar.getEngine() != car.getEngine()){
                continue;
            }

            if(searchedCar.getType() != car.getType()){
                continue;
            }

            if(searchedCar.getTransmission() != car.getTransmission()){
                continue;
            }

            return car;
        }

        return null;
    }

}
