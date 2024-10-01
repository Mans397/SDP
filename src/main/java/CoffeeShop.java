//здесь юзаю паттерн одиночку
public class CoffeeShop {
    private static CoffeeShop instance;

    private CoffeeShop() {}

    public static CoffeeShop getInstance() { // для создания обьекта
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void takeOrder(Coffee coffee) { //метод для получения названия кофе
        System.out.println("Order received for: " + coffee.getName());
    }
}