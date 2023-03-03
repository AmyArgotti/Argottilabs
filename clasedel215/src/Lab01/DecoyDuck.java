package Lab01;
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super();
        setType("DecoyDuck");
    }

    public void performanceFly() {
        System.out.println("not able to FLY ");
    }

    public void performanceQuack() {
        System.out.println("not able to QUACK");
    }
}

