package assignment3.Mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<Sensor> sensors = new ArrayList<>();  // Список зарегистрированных датчиков
    private StringBuilder report = new StringBuilder();  // Строка для формирования отчета

    // Метод для регистрации датчика
    @Override
    public void registerSensor(Sensor sensor) {
        sensors.add(sensor);  // Добавляем датчик в список
    }

    // Метод для сбора данных с датчиков
    @Override
    public void collectData() {
        report.setLength(0);  // Сбросить отчет
        for (Sensor sensor : sensors) {
            sensor.sendData();  // Запросить данные от каждого датчика
        }
    }

    // Метод для печати отчета
    @Override
    public void printReport() {
        System.out.println("Sensor Report: ");
        System.out.println(report.toString());  // Выводим отчет
    }

    // Метод для добавления данных в отчет
    public void addReport(String data) {
        report.append(data).append("\n");  // Добавляем данные в отчет
    }
}