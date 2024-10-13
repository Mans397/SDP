package assignment3.Command;

public class TurnOnCommand implements Command {
    private Television television;  // Ссылка на объект телевизора

    // Конструктор, принимающий объект телевизора
    public TurnOnCommand(Television television) {
        this.television = television;  // Инициализируем ссылку на телевизор
    }

    // Метод для выполнения команды включения телевизора
    public void execute() {
        television.turnOn();  // Вызываем метод для включения телевизора
    }
}