import com.fasterxml.jackson.databind.ObjectMapper;
import enums.*;

import java.io.File;
import java.io.IOException;

public class Car extends Automobil{
    private String serialNumber;
    private Color color;
    private Engine engine;
    private Model model;
    private Transmission transmission;
    private Type type;
    private Double price;

    public Car(Color color, Engine engine, Model model, Transmission transmission, Type type, Double price) {
        this.serialNumber = (int)(Math.random() * 1000) +"";
        this.color = color;
        this.engine = engine;
        this.model = model;
        this.transmission = transmission;
        this.type = type;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // THIS method write the car object into a JSON file at the path src/main/java/jsons/ the file will have the serial number of the car
    public void getAsJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.writeValue(new File("src/main/java/jsons/car" + getSerialNumber() + ".json"), this);
    }


    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serialNumber + '\'' +
                ", color=" + color +
                ", engine=" + engine +
                ", model=" + model +
                ", transmission=" + transmission +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
