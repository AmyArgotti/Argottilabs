import enums.*;

import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        createInventory(inventory);

        Car car = inventory.search(new Car(Color.RED, Engine.DIESEL, Model.GMC, Transmission.AUTOMATIC, Type.COUPE, 1000.0));
        if(car != null){
            System.out.println("You may like this car:" +
                    car);
        }
        else{
            System.out.println("no car was found");
        }

        // get the cars as JSON

        LinkedList<Car> carList = (LinkedList<Car>) inventory.getCars();

        try{
            createJSON(carList);
        }catch(IOException e){
            System.out.println(e);
        }

        // in this case we want to create a lada car and add it to the inventory, since the main Class is Car it will be posible
        // here we can see how the polymorphism works ))))
        inventory.addCarToInventory(new Lada("some lada",Color.RED, Engine.DIESEL, Model.GMC, Transmission.AUTOMATIC, Type.COUPE, 1000.0));
    }

    public static void createInventory(Inventory inventory){
        inventory.addCarToInventory(Color.BLACK, Engine.DIESEL, Model.BMW, Transmission.AUTOMATIC, Type.COUPE, 100200.1 );
        inventory.addCarToInventory(Color.WHITE, Engine.ELECTRIC, Model.GMC, Transmission.MANUAL_TRANSMISSION, Type.MINIVAN, 100300.1 );
        inventory.addCarToInventory(Color.RED, Engine.DIESEL, Model.GMC, Transmission.AUTOMATIC, Type.COUPE, 104000.1 );
        inventory.addCarToInventory(Color.RED, Engine.DIESEL, Model.GMC, Transmission.AUTOMATIC, Type.COUPE, 104000.1 );
        inventory.addCarToInventory(Color.RED, Engine.DIESEL, Model.AUDI, Transmission.AUTOMATIC, Type.COUPE, 124000.1 );
        inventory.addCarToInventory(Color.RED, Engine.DIESEL, Model.GMC, Transmission.AUTOMATIC, Type.COUPE, 104000.1 );

    }

    public static void createJSON( LinkedList<Car> carList) throws IOException {
        for(Car c: carList){
            c.getAsJSON();
        }
    }
}

