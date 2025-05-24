package beverage;

import serving.ServingStyle;

public abstract class Coffee extends Beverage {
    public Coffee(int sugar, ServingStyle servingStyle) {
        super(sugar, servingStyle);
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
    }

    @Override
    public int cost() {
        return 10;
    }
}
