package assignment3.Mediator;

// Интерфейс медиатора для управления датчиками в системе
public interface HomeMediator {
    void registerSensor(Sensor sensor);  // Метод для регистрации датчика
    void collectData();  // Метод для сбора данных с датчиков
    void printReport();  // Метод для печати отчета о данных
}