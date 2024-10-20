package Assignment4.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {

    @Override
    public double calculateFinalPrice(double orderAmount) {
        // Добавляем 300 рублей за доставку
        return orderAmount + 300;
    }
}
