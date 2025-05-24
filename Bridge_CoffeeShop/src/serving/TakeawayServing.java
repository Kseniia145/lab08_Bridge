package serving;

public class TakeawayServing implements ServingStyle {
    @Override
    public void serve() {
        System.out.println("Serving in a disposable cup for takeaway.");
    }
}
