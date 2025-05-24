package beverage;

import serving.ServingStyle;

public abstract class Tee extends Beverage {
    public Tee(int sugar, ServingStyle servingStyle) {
        super(sugar, servingStyle);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
    }

    @Override
    public int cost() {
        return 7;
    }
}
