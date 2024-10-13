package assignment3.Command;

public class VolumeDownCommand implements Command {
    private Television television;  // Ссылка на объект телевизора

    // Конструктор, принимающий объект телевизора
    public VolumeDownCommand(Television television) {
        this.television = television;  // Инициализируем ссылку на телевизор
    }

    // Метод для выполнения команды уменьшения громкости
    public void execute() {
        television.volumeDown();  // Вызываем метод для уменьшения громкости
    }
}