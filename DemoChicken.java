public class DemoChicken extends Chicken{
    public DemoChicken(){
        flyBehavior = new FlyNoWay();
        cluckBehavior = new Cluck();
    }
    public void display(){
        System.out.println("A Demo Chicken");
    }
}
