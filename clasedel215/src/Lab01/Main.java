package Lab01;
public class Main {
    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performanceQuack();
        redheadDuck.performanceFly();
        System.out.println("================================================================");
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performanceQuack();
        mallardDuck.performanceFly();
        System.out.println("================================================================");
        rubberDuck.display();
        redheadDuck.swim();
        rubberDuck.performanceQuack();
        rubberDuck.performanceFly();
        System.out.println("================================================================");
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performanceQuack();
        decoyDuck.performanceFly();
    }
}
