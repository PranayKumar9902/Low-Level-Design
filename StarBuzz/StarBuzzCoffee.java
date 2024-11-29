package StarBuzz;

import StarBuzz.coffee.DarkRoast;
import StarBuzz.coffee.Espresso;
import StarBuzz.coffee.HouseBlend;
import StarBuzz.condiments.Mocha;
import StarBuzz.condiments.Soy;
import StarBuzz.condiments.SteamedMilk;
import StarBuzz.condiments.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {

        System.out.println("====================================");

        Bevarage bevarage = new Espresso();
        System.out.println(bevarage.getDescription() + " $" + bevarage.cost());

        System.out.println("====================================");

        Bevarage bevarage2 = new DarkRoast();
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Soy(bevarage2);
        bevarage2 = new Whip(bevarage2);
        System.out.println(bevarage2.getDescription() + " $" + bevarage2.cost());

        System.out.println("====================================");

        Bevarage bevarage3 = new HouseBlend();
        bevarage3 = new Soy(bevarage3);
        bevarage3 = new Mocha(bevarage3);
        bevarage3 = new SteamedMilk(bevarage3);
        System.out.println(bevarage3.getDescription() + " $" + bevarage3.cost());

        System.out.println("====================================");
    }
}
