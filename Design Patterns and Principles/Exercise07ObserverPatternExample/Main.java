package Exercise07ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        StockMarket tesla = new StockMarket("TESLA", 700.00);

        Observer user1Mobile = new MobileApp("Hari");
        Observer user2Web = new WebApp("Krishna");

        tesla.registerObserver(user1Mobile);
        tesla.registerObserver(user2Web);

        tesla.setPrice(725.50);
        tesla.setPrice(745.00);

        // Remove one observer and change again
        tesla.removeObserver(user1Mobile);
        tesla.setPrice(760.00);
    }
}