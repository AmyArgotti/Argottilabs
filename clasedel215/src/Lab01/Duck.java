package Lab01;

public abstract class Duck {
    private String type;

    public Duck() {
    }

    public void display() {
        System.out.println("Looks like a " + this.type);
    }

    public void swim() {
        System.out.println(type + " is able to SWIM ");
    }

    public abstract void performanceFly();
    public abstract void performanceQuack();



    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

