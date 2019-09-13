public class SpecialDuck extends Duck {
    public SpecialDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("Special Duck");
    }
}
