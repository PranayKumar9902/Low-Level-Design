package StarBuzz.condiments;

import StarBuzz.Bevarage;
import StarBuzz.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Bevarage bevarage) {
        this.bevarage = bevarage;
    }
    public String getDescription() {
        return bevarage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return .10 + bevarage.cost();
    }

}
