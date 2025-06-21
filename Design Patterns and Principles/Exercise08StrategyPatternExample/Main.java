package Exercise08StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

    
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "Hari Krishna");
        context.setPaymentStrategy(creditCard);
        context.pay(2500.00);

    
        PaymentStrategy paypal = new PayPalPayment("hari@example.com");
        context.setPaymentStrategy(paypal);
        context.pay(1500.00);
    }
}
