package Exercise04AdapterPatternExample;

public class StripeGateway {
    public void pay(double amount) {
        System.out.println("Processing payment of Rs." + amount + " via Stripe.");
    }
}