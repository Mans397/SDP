package Assignment4.Strategy;

public class Order {
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Order(double amount) {
        this.amount = amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateTotal() {
        return paymentStrategy.calculateFinalPrice(amount);
    }
}
