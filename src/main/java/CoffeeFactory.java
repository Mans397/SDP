class CoffeeFactory {
    public Coffee createCoffee(String type) {
        switch (type) {
            case "Espresso":
                return new Espresso();
            case "Latte":
                return new Latte();
            default:
                throw new IllegalArgumentException("Unknown coffee type.");
        }
    }
}