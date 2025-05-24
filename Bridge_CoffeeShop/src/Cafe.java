import beverage.*;
import serving.*;

public class Cafe {
    public static void main(String[] args) {
        ServingStyle inHouse = new InHouseServing();
        ServingStyle takeaway = new TakeawayServing();

        Beverage[] beverages = new Beverage[] {
                new BlackChocolate(3, 200, inHouse),
                new BlackCoffee(3, 200, true, takeaway),
                new BlackTee(0, 300, inHouse),
                new MilkChocolate(3, 200, takeaway),
                new CoffeeWithMilk(3, 200, inHouse),
                new TeeWithMilk(2, 300, takeaway)
        };

        for (Beverage beverage : beverages) {
            System.out.println("=========================");
            beverage.prepare();
            System.out.printf("Cost of beverage: %s grn%n", beverage.cost());
            beverage.serve();
            beverage.drink();
        }
    }
}
