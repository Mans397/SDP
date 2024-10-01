//используется паттерн: "Строитель"
class CoffeeBuilder {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeBuilder setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public CoffeeBuilder setMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeBuilder setSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeOrder build() {
        return new CoffeeOrder(coffee, milk, syrup);
    }
}