package assignment3.Mediator;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;  // Медиатор для взаимодействия с другими компонентами

    // Конструктор, принимающий медиатор и регистрирующий датчик
    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;  // Инициализируем медиатор
        mediator.registerSensor(this);  // Регистрируем датчик в медиаторе
    }

    // Метод для отправки данных о влажности
    @Override
    public void sendData() {
        String data = "Humidity: 55%";  // Пример данных о влажности
        System.out.println(data);  // Выводим данные в консоль
        ((HomeMediatorImpl) mediator).addReport(data);  // Добавляем данные в отчет
    }
}