package assignment3.Command;

public class NextChannelCommand implements Command {
    private Television television;  // Ссылка на объект телевизора

    // Конструктор, принимающий объект телевизора
    public NextChannelCommand(Television television) {
        this.television = television;  // Инициализируем ссылку на телевизор
    }

    // Метод для выполнения команды переключения на следующий канал
    public void execute() {
        television.nextChannel();  // Вызываем метод для переключения на следующий канал
    }
}