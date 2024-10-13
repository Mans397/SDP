package assignment3.Memento;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private StringBuilder text;  // Текущий текст редактора
    private List<TextMemento> mementos;  // Список менторов для сохраненных состояний

    // Конструктор, инициализирующий текст и список менторов
    public TextEditor() {
        text = new StringBuilder();  // Создаем новый текст
        mementos = new ArrayList<>();  // Инициализируем список менторов
    }

    // Метод для добавления текста
    public void addText(String newText) {
        text.append(newText);  // Добавляем новый текст
    }

    // Метод для отображения текущего текста
    public void showText() {
        System.out.println("Current Text: " + text.toString());  // Выводим текущий текст
    }

    // Метод для сохранения состояния редактора
    public TextMemento save() {
        TextMemento memento = new TextMemento(text.toString());  // Создаем новый ментор
        mementos.add(memento);  // Добавляем ментор в список
        return memento;  // Возвращаем ментор
    }

    // Метод для восстановления состояния редактора из ментора
    public void restore(TextMemento memento) {
        text = new StringBuilder(memento.getText());  // Восстанавливаем текст из ментора
    }
}