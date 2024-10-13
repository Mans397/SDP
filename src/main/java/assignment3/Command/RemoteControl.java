package assignment3.Command;

import java.util.HashMap;
import java.util.Map;

// Класс для управления телевизором через удаленный пульт
public class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();  // Хранит команды, назначенные кнопкам

    // Метод для установки команды на кнопку
    public void setCommand(String button, Command command) {
        commands.put(button, command);  // Добавляем команду в коллекцию по имени кнопки
    }

    // Метод, вызываемый при нажатии кнопки
    public void buttonPressed(String button) {
        Command command = commands.get(button);  // Получаем команду, связанную с нажатой кнопкой
        if (command != null) {
            command.execute();  // Выполняем команду, если она существует
        } else {
            System.out.println("Unknown Command: " + button);  // Выводим сообщение, если команда не найдена
        }
    }
}