public abstract class Chicken {
    FlyBehavior flyBehavior;
    CluckBehavior cluckBehavior;

    public Chicken(){
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performCluck(){
        cluckBehavior.cluck();
    }
    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setCluckBehavior(CluckBehavior cb){
        cluckBehavior = cb;
    }
}
