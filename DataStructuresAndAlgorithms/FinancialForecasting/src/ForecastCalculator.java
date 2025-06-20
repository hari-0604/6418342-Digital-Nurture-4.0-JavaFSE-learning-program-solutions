package FinancialForecasting.src;
public class ForecastCalculator {

    
    public static double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) return amount;
        return calculateFutureValue(amount * (1 + rate / 100), rate, years - 1);
    }

    
    public static double calculateFutureValueDP(double amount, double rate, int years) {
        double[] memo = new double[years + 1];
        memo[0] = amount;

        for (int i = 1; i <= years; i++) {
            memo[i] = memo[i - 1] * (1 + rate / 100);
        }

        return memo[years];
    }

    public static void main(String[] args) {
        double initialAmount = 10000;
        double growthRate = 7.5; // in percent
        int years = 5;

        double futureValue = calculateFutureValue(initialAmount, growthRate, years);
        System.out.printf("Future Value (Recursive): ₹%.2f\n", futureValue);

        double futureValueDP = calculateFutureValueDP(initialAmount, growthRate, years);
        System.out.printf("Future Value (Memoized): ₹%.2f\n", futureValueDP);
    }
}
