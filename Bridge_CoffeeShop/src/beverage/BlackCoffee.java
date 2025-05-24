package beverage;

import serving.ServingStyle;

public class BlackCoffee extends Coffee {
    private final int water_volume;
    private final boolean extra_coffee;

    public BlackCoffee(int sugar, int water_volume, boolean extra_coffee, ServingStyle servingStyle) {
        super(sugar, servingStyle);
        this.water_volume = water_volume;
        this.extra_coffee = extra_coffee;
    }

    @Override
    public void drink() {
        System.out.println("Drink black coffee!");
    }

    @Override
    public void prepare() {
        super.prepare();
        if (extra_coffee) System.out.println("Put extra coffee...");
        System.out.printf("Put some hot water: %s ml...%n", water_volume);
        if (sugar > 0) System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
    }
}
