package home03;

import home03.Organization;

public class Factory extends Organization {
    public Factory() {
        super();
        setType("завод");
    }

    public void performancePublic() {
        System.out.println("isn't an organization public");
    }

    public void performanceMedical() {
        System.out.println("it doesn't work in medical area");
    }

}