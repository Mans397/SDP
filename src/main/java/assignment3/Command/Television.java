package assignment3.Command;

public class Television {
    private int volume = 10;  // Уровень громкости (начальное значение 10)
    private int channel = 1;  // Номер канала (начальное значение 1)
    private boolean isOn = false;  // Состояние телевизора (включен/выключен)

    // Метод для включения телевизора
    public void turnOn() {
        isOn = true;  // Устанавливаем состояние на "включен"
        System.out.println("Television is turned ON");
    }

    // Метод для выключения телевизора
    public void turnOff() {
        isOn = false;  // Устанавливаем состояние на "выключен"
        System.out.println("Television is turned OFF");
    }

    // Метод для увеличения громкости
    public void volumeUp() {
        if (isOn) {
            volume++;  // Увеличиваем уровень громкости
            System.out.println("Volume is now: " + volume);  // Выводим текущий уровень громкости
        } else {
            System.out.println("Television is OFF");  // Сообщаем, если телевизор выключен
        }
    }

    // Метод для уменьшения громкости
    public void volumeDown() {
        if (isOn) {
            volume--;  // Уменьшаем уровень громкости
            System.out.println("Volume is now: " + volume);  // Выводим текущий уровень громкости
        } else {
            System.out.println("Television is OFF");  // Сообщаем, если телевизор выключен
        }
    }

    // Метод для переключения на следующий канал
    public void nextChannel() {
        if (isOn) {
            channel++;  // Переходим на следующий канал
            System.out.println("Channel is now: " + channel);  // Выводим номер текущего канала
        } else {
            System.out.println("Television is OFF");  // Сообщаем, если телевизор выключен
        }
    }

    // Метод для переключения на предыдущий канал
    public void previousChannel() {
        if (isOn) {
            channel--;  // Возвращаемся на предыдущий канал
            System.out.println("Channel is now: " + channel);  // Выводим номер текущего канала
        } else {
            System.out.println("Television is OFF");  // Сообщаем, если телевизор выключен
        }
    }
}