package assignment3.Chain;

public abstract class PaymentHandler {
    protected PaymentHandler next;  // Ссылка на следующий обработчик в цепочке

    // Метод для установки следующего обработчика в цепочке
    public PaymentHandler setNext(PaymentHandler nextHandler) {
        this.next = nextHandler;  // Устанавливаем следующий обработчик
        return next;  // Возвращаем текущий объект для удобства использования в цепочке вызовов
    }

    // Абстрактный метод для обработки платежа
    public abstract boolean handle(float money);  // Подклассы должны реализовать этот метод
}