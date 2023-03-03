package Lab01;

public class RubberDuck extends Duck{
    public RubberDuck() {
        super();
        setType("Rubber Duck");
    }

    public void performanceFly() {
        System.out.println("not able FLY");
    }

    public void performanceQuack() {
        System.out.println("not able to QUACK,  but able to SQUEAK");
    }

}

