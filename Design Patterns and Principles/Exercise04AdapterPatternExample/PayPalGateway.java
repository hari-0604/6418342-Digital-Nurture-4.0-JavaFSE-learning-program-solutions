package Exercise04AdapterPatternExample;

public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of Rs." + amount + " via PayPal.");
    }
}