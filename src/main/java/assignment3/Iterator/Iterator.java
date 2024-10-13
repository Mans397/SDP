package assignment3.Iterator;

// Интерфейс для итератора, позволяющий перебор элементов коллекции
public interface Iterator<T> {
    // Метод для проверки, есть ли следующий элемент
    boolean hasNext();

    // Метод для получения следующего элемента
    T next();
}