package assignment3.Iterator;

public class ArrayMovieCollection implements MovieCollection {
    private String[] movies;  // Массив для хранения фильмов
    private int index = 0;  // Индекс для добавления нового фильма

    // Конструктор, принимающий размер коллекции фильмов
    public ArrayMovieCollection(int size) {
        movies = new String[size];  // Инициализируем массив фильмов заданного размера
    }

    // Метод для добавления фильма в коллекцию
    public ArrayMovieCollection addMovie(String movie) {
        // Проверяем, достаточно ли места для добавления нового фильма
        if (index < movies.length) {
            movies[index++] = movie;  // Добавляем фильм и увеличиваем индекс
        }
        return this;  // Возвращаем текущий объект для удобства вызова методов
    }

    // Метод для создания итератора для коллекции фильмов
    @Override
    public Iterator<String> createIterator() {
        return new ArrayMovieIterator(movies);  // Возвращаем новый итератор для массива фильмов
    }
}