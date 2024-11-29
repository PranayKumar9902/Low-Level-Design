package StarBuzz.condiments;

import StarBuzz.Bevarage;
import StarBuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Bevarage bevarage) {
        this.bevarage = bevarage;
    }
    public String getDescription() {
        return bevarage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + bevarage.cost();
    }

}
