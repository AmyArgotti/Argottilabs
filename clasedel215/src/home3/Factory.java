package home3;

import home3.Organization;

public class Factory extends Organization {
    public Factory() {
        super();
        setType("завод");
    }

    public void performancePublic() {
        System.out.println("isn't an organization public");
    }

    public void performanceMedical() {
        System.out.println("able to QUACK");
    }

}