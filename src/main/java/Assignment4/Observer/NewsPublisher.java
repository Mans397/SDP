package Assignment4.Observer;

public interface NewsPublisher {
    void subscribe(Observer observer);
    void notifySubscribers(String category, String news);
}
