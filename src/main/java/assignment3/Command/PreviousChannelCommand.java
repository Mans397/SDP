package assignment3.Command;

public class PreviousChannelCommand implements Command {
    private Television television;  // Ссылка на объект телевизора

    // Конструктор, принимающий объект телевизора
    public PreviousChannelCommand(Television television) {
        this.television = television;  // Инициализируем ссылку на телевизор
    }

    // Метод для выполнения команды переключения на предыдущий канал
    public void execute() {
        television.previousChannel();  // Вызываем метод для переключения на предыдущий канал
    }
}