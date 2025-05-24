package beverage;

import serving.ServingStyle;

public abstract class Beverage {
    protected final int sugar;
    protected final ServingStyle servingStyle;

    public Beverage(int sugar, ServingStyle servingStyle) {
        this.sugar = sugar;
        this.servingStyle = servingStyle;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();

    public void serve() {
        servingStyle.serve();
    }
}
