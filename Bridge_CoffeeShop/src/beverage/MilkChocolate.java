package beverage;

import serving.ServingStyle;

public class MilkChocolate extends Chocolate {
    private final int milkVolume;

    public MilkChocolate(int sugar, int milkVolume, ServingStyle servingStyle) {
        super(sugar, servingStyle);
        this.milkVolume = milkVolume;
    }

    @Override
    public void drink() {
        System.out.println("Drink milk chocolate beverage!");
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.printf("Put some milk : %s ml...%n", milkVolume);
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public int cost() {
        return super.cost() + milkVolume / 20;
    }
}
