package beverages;

public abstract class Beverage {
    protected String description;

    public Beverage() {
        this.description = "unknown description";
    }

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
