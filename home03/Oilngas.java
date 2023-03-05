package home03;
import home03.Organization;
public class Oilngas extends Organization {
    public Oilngas() {
        super();
        setType("нефтегазовая компания");
    }
    @Override
    public void performancePublic() {
        System.out.println("isn't an organization public ");
    }
    @Override
    public void performanceMedical() {
        System.out.println("it doesn't  works in medical area");
    }
}