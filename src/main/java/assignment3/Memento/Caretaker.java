package assignment3.Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<TextMemento> mementoStack;  // Стек для хранения объектов-менторов

    // Конструктор, инициализирующий стек
    public Caretaker() {
        mementoStack = new Stack<>();  // Создаем новый стек
    }

    // Метод для сохранения состояния редактора
    public void save(TextEditor editor) {
        mementoStack.push(editor.save());  // Сохраняем текущее состояние редактора в стек
    }

    // Метод для восстановления состояния редактора
    public void restore(TextEditor editor) {
        if (!mementoStack.isEmpty()) {
            editor.restore(mementoStack.pop());  // Восстанавливаем последнее сохраненное состояние
        } else {
            System.out.println("No mementos to restore.");  // Выводим сообщение, если нет сохраненных состояний
        }
    }
}