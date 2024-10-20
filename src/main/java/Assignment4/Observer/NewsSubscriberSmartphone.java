package Assignment4.Observer;

// Подписчик на смартфоне, интересующийся категориями «Спорт»
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        if ("Спорт".equalsIgnoreCase(category)) {
            System.out.println("Smartphone received sports news: " + news);
        }
    }
}


