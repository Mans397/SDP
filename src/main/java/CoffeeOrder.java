// юзаем прототип для клонирования обьекта
public class CoffeeOrder implements Cloneable {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeOrder(Coffee coffee, Milk milk, Syrup syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    @Override
    public CoffeeOrder clone() {
        try {
            return (CoffeeOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            return new CoffeeOrder(coffee, milk, syrup);
        }
    }

    public void displayOrder() {
        System.out.println("Coffee: " + coffee.getName() + ", Milk: " + milk.getType() + ", Syrup: " + syrup.getFlavor());
    }

    public Coffee getCoffee() {
        return coffee;
    }

}