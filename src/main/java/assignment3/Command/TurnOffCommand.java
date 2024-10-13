package assignment3.Command;

public class TurnOffCommand implements Command {
    private Television television;  // Ссылка на объект телевизора

    // Конструктор, принимающий объект телевизора
    public TurnOffCommand(Television television) {
        this.television = television;  // Инициализируем ссылку на телевизор
    }

    // Метод для выполнения команды выключения телевизора
    public void execute() {
        television.turnOff();  // Вызываем метод для выключения телевизора
    }
}