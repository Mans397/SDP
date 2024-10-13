package assignment3.Iterator;

public class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;  // Массив фильмов
    private int position = 0;  // Текущая позиция в массиве

    // Конструктор, принимающий массив фильмов
    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;  // Инициализируем массив фильмов
    }

    // Метод для проверки, есть ли следующий элемент
    @Override
    public boolean hasNext() {
        // Проверяем, есть ли еще элементы в массиве и не является ли текущий элемент null
        return position < movies.length && movies[position] != null;
    }

    // Метод для получения следующего элемента
    @Override
    public String next() {
        // Если есть следующий элемент, возвращаем его и переходим к следующему
        if (this.hasNext()) {
            return movies[position++];  // Возвращаем текущий элемент и увеличиваем позицию
        }
        return null;  // Если следующего элемента нет, возвращаем null
    }
}