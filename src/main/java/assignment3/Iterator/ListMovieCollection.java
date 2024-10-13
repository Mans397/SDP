package assignment3.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ListMovieCollection implements MovieCollection {
    private List<String> movies;  // Список для хранения фильмов

    // Конструктор, инициализирующий список фильмов
    public ListMovieCollection() {
        movies = new ArrayList<>();
    }

    // Метод для добавления фильма в коллекцию
    public ListMovieCollection addMovie(String movie) {
        movies.add(movie);  // Добавляем фильм в список
        return this;  // Возвращаем текущий объект
    }

    // Метод для создания итератора для коллекции фильмов
    @Override
    public Iterator<String> createIterator() {
        return new ListMovieIterator(movies);  // Возвращаем новый итератор для списка фильмов
    }
}