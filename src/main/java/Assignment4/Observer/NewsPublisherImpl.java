package Assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void notifySubscribers(String category, String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(category, news);
        }
    }

    public void publishNews(String category, String news) {
        System.out.println("Publishing news in category: " + category + " - " + news);
        notifySubscribers(category, news);
    }
}
