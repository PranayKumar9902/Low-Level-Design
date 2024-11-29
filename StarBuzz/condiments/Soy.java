package StarBuzz.condiments;

import StarBuzz.Bevarage;
import StarBuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Bevarage bevarage) {
        this.bevarage = bevarage;
    }
    public String getDescription() {
        return bevarage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + bevarage.cost();
    }

}
