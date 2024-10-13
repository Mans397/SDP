package assignment3.Iterator;

// Интерфейс для коллекции фильмов, позволяющий создавать итератор
public interface MovieCollection {
    Iterator<String> createIterator();  // Метод для создания итератора
}