package assignment3.Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;  // Медиатор для взаимодействия с другими компонентами

    // Конструктор, принимающий медиатор и регистрирующий датчик
    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;  // Инициализируем медиатор
        mediator.registerSensor(this);  // Регистрируем датчик в медиаторе
    }

    // Метод для отправки данных о температуре
    @Override
    public void sendData() {
        String data = "Temperature: 22°C";  // Пример данных о температуре
        System.out.println(data);  // Выводим данные в консоль
        ((HomeMediatorImpl) mediator).addReport(data);  // Добавляем данные в отчет
    }
}