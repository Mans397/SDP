package assignment3.Mediator;

public class LightSensor implements Sensor {
    private HomeMediator mediator;  // Медиатор для взаимодействия с другими компонентами

    // Конструктор, принимающий медиатор и регистрирующий датчик
    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;  // Инициализируем медиатор
        mediator.registerSensor(this);  // Регистрируем датчик в медиаторе
    }

    // Метод для отправки данных о свете
    @Override
    public void sendData() {
        String data = "Light: 300 Lux";  // Пример данных о свете
        System.out.println(data);  // Выводим данные в консоль
        ((HomeMediatorImpl) mediator).addReport(data);  // Добавляем данные в отчет
    }
}