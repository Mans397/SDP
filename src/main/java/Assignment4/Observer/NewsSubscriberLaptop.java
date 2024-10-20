package Assignment4.Observer;

// Подписчик на ноутбуке, интересующийся категориями «Наука»
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        if ("Наука".equalsIgnoreCase(category)) {
            System.out.println("Laptop received science news: " + news);
        }
    }
}


