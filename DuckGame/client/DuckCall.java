package DuckGame.client;

import DuckGame.quack.Quack;
import DuckGame.quack.QuackBehavior;

public class DuckCall {

    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void display() {
        System.out.println("I'm a Duck Call");
    }
}
