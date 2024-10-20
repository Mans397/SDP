package Assignment4.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {

    @Override
    public double calculateFinalPrice(double orderAmount) {
        // Без комиссии
        return orderAmount;
    }
}
