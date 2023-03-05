package home03;

import home03.Organization;

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
        System.out.println("it works in medical area");
    }

}