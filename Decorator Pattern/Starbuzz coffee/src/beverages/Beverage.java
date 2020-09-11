package beverages;

public abstract class Beverage {
    protected String description;
    protected Size size;

    public Beverage() {
        this.size = Size.TALL;
        this.description = "unknown description";
    }

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract Double cost();
}
