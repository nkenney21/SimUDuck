package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		PerformAll mallard = new MallardDuck(new Squeak(),new FlyWithWings());
                
                mallard.performQuack();
	}

}
