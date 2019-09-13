public class BirdSimulator {
    public static void main(String[] args){
        Duck specialDuck = new SpecialDuck();
        specialDuck.display();
        specialDuck.performFly();
        specialDuck.performQuack();
        specialDuck.swim();

        Chicken chicken = new DemoChicken();
        chicken.display();
        chicken.performCluck();
        chicken.performFly();

    }
}
