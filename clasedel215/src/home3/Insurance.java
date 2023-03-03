package home3;

import home3.Organization;

public class Insurance extends Organization {
    public Insurance() {
        super();
        setType("страховая компания");
    }

    @Override
    public void performancePublic() {
        System.out.println("isn't an organization public");

    }

    @Override
    public void performanceMedical() {
        System.out.println("able to QUACK");
    }

}
