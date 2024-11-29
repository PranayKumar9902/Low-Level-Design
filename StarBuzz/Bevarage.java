package StarBuzz;

public abstract class Bevarage {

    public String description = "Unknown Bevarage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
