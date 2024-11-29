package DuckGame.client;

import DuckGame.fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("..........................................");

        Duck model = new ModelDuck();   
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}