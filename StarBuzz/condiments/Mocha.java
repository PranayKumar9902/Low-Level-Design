package StarBuzz.condiments;

import StarBuzz.Bevarage;
import StarBuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Bevarage bevarage) {
        this.bevarage = bevarage;
    }
    public String getDescription() {
        return bevarage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + bevarage.cost();
    }
    

}
