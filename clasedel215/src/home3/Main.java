package home3;

import home3.Factory;
import home3.Insurance;
import home3.Oilngas;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory ();
        Insurance insurance = new Insurance();
        Oilngas oilngas = new Oilngas();

        Factory.display();
        Factory.wholesale();
        Factory.performancePublic();
        Factory.performanceMedical();
        System.out.println("----------------------------------------------------------------");
        Insurance.display();
        Insurance.wholesale();
        Insurance.performancePublic();
        Insurance.performanceMedical();
        System.out.println("----------------------------------------------------------------");
        Oilngas.display();
        Oilngas.wholesale);
        Oilngas.performancePublic();
        Oilngas.performanceMedical();

    }
}

