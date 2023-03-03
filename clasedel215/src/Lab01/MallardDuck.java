package Lab01;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super();
        setType("Mallard Duck");
    }

    @Override
    public void performanceFly() {
        System.out.println("able to FLY");

    }

    @Override
    public void performanceQuack() {
        System.out.println("able to QUACK");
    }

}

