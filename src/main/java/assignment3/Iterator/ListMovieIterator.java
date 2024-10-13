package assignment3.Iterator;

import java.util.List;

public class ListMovieIterator implements Iterator<String> {
    private List<String> movies;  // Список фильмов
    private int position = 0;  // Текущая позиция в списке

    // Конструктор, принимающий список фильмов
    public ListMovieIterator(List<String> movies) {
        this.movies = movies;  // Инициализируем список фильмов
    }

    // Метод для проверки, есть ли следующий элемент
    @Override
    public boolean hasNext() {
        return position < movies.size();  // Проверяем, есть ли еще элементы в списке
    }

    // Метод для получения следующего элемента
    @Override
    public String next() {
        if (this.hasNext()) {
            return movies.get(position++);  // Возвращаем текущий элемент и увеличиваем позицию
        }
        return null;  // Если следующего элемента нет, возвращаем null
    }
}