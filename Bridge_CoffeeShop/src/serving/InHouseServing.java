package serving;

public class InHouseServing implements ServingStyle {
    @Override
    public void serve() {
        System.out.println("Serving in a ceramic cup for in-house consumption.");
    }
}
