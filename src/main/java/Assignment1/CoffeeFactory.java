package Assignment1;

class CoffeeFactory {
    public Coffee createCoffee(String type) {
        switch (type) {
            case "Assignment1.Espresso":
                return new Espresso();
            case "Assignment1.Latte":
                return new Latte();
            default:
                throw new IllegalArgumentException("Unknown coffee type.");
        }
    }
}