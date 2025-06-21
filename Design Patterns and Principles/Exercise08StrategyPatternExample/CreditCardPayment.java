package Exercise08StrategyPatternExample;


public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid \u20B9" + amount + " using Credit Card (Holder: " + cardHolderName + ").");
    }
}
