package home03;

import home03.Factory;
import home03.Insurance;
import home03.Oilngas;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory ();
        Insurance insurance = new Insurance();
        Oilngas oilngas = new Oilngas();

        factory.display();
        factory.wholesale();
        factory.performancePublic();
        factory.performanceMedical();
        System.out.println("----------------------------------------------------------------");
        insurance.display();
        insurance.wholesale();
        insurance.performancePublic();
        insurance.performanceMedical();
        System.out.println("----------------------------------------------------------------");
        oilngas.display();
        oilngas.wholesale();
        oilngas.performancePublic();
        oilngas.performanceMedical();

    }
}