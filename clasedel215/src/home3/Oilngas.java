package home3;
import home3.Organization;
public class Oilngas extends Organization {
    public Oilngas() {
        super();
        setType("нефтегазовая компания ");
    }

    public void performancePublic() {
        System.out.println("isn't an organization public ");
    }

    public void performanceMedical() {
        System.out.println("not able to QUACK");
    }
}


