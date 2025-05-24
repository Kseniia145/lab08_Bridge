package beverage;

import serving.ServingStyle;

public abstract class Chocolate extends Beverage {
    public Chocolate(int sugar, ServingStyle servingStyle) {
        super(sugar, servingStyle);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
    }

    @Override
    public int cost() {
        return 15;
    }
}
