import enums.*;

public class Motocicle extends Automobil {
    private String MotocicleType;

    public Motocicle(Color color, Engine engine, Model model, Transmission transmission, Type type, Double price) {
        this.serialNumber = (int)(Math.random() * 1000) +"";
        this.color = color;
        this.engine = engine;
        this.model = model;
        this.transmission = transmission;
        this.type = type;
        this.price = price;
    }
}
