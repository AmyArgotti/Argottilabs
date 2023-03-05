package home03;

public abstract class Organization {
    private static String type;

    public Organization() {
    }

    public void display() {
        System.out.println("This organization is a(an) " + type);
    }

    public static void wholesale() {
        System.out.println(type + " they work with wholesale ");
    }

    public abstract void performancePublic();

    public abstract void performanceMedical();



    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}