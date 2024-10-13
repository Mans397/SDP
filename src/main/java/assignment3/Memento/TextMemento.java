package assignment3.Memento;

public class TextMemento {
    private String text;  // Сохраненный текст

    // Конструктор для инициализации текста
    public TextMemento(String text) {
        this.text = text;  // Устанавливаем текст
    }

    // Метод для получения сохраненного текста
    public String getText() {
        return text;  // Возвращаем текст
    }
}