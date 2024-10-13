package assignment3.Command;

public class VolumeUpCommand implements Command {
    private Television television;  // Ссылка на объект телевизора

    // Конструктор, принимающий объект телевизора
    public VolumeUpCommand(Television television) {
        this.television = television;  // Инициализируем ссылку на телевизор
    }

    // Метод для выполнения команды увеличения громкости
    public void execute() {
        television.volumeUp();  // Вызываем метод для увеличения громкости
    }
}