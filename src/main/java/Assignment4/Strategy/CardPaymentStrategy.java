package Assignment4.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public double calculateFinalPrice(double orderAmount) {
        // Добавляем комиссию 2% от стоимости заказа
        return orderAmount + (orderAmount * 0.02);
    }
}
