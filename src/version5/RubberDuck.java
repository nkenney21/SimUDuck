package version5;

public class RubberDuck implements QuackPerformer {
    
    private QuackBehavior qb;

    public RubberDuck(QuackBehavior qb) {
        this.qb = qb;
    }
    
    
   

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

    @Override
    public void performQuack() {
        qb.quack();
    }

    @Override
    public void setQuackBehavior(QuackBehavior qb) {
        this.qb = qb;
    }

}
