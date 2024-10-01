public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee espresso = coffeeFactory.createCoffee("Espresso");
        espresso.prepare();

        IngredientFactory latteFactory = new LatteIngredientFactory();
        Milk milk = latteFactory.createMilk();
        Syrup syrup = latteFactory.createSyrup();

        CoffeeOrder order1 = new CoffeeOrder(espresso, milk, syrup);
        order1.displayOrder();

        CoffeeOrder order2 = order1.clone();
        order2.displayOrder();

        CoffeeBuilder builder = new CoffeeBuilder();
        CoffeeOrder customOrder = builder.setCoffee(espresso).setMilk(new AlmondMilk()).setSyrup(new VanillaSyrup()).build();
        customOrder.displayOrder();

        coffeeShop.takeOrder(customOrder.getCoffee());
    }
}