package Assignment4.Observer;

// Подписчик на планшете, интересующийся всеми категориями
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Tablet received news in category " + category + ": " + news);
    }
}
