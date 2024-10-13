package assignment3.Chain;

public class PaymentB extends PaymentHandler {
    // Переменная для хранения доступных средств (300 долларов)
    private float dollars = 300;

    // Переопределенный метод обработки платежа
    @Override
    public boolean handle(float money) {
        // Проверяем, достаточно ли денег для оплаты
        if (dollars >= money) {
            System.out.println("Payment B: You have enough money!");
            dollars -= money;  // Уменьшаем сумму денег после оплаты
            return true;  // Платеж успешно обработан
        } else {
            System.out.println("Payment B: You don't have enough money!");
            // Если денег недостаточно, передаем запрос следующему обработчику, если он существует
            if (next != null) {
                return next.handle(money);  // Передаем запрос дальше по цепочке
            }
        }
        // Если платеж не был обработан, возвращаем false
        return false;
    }
}