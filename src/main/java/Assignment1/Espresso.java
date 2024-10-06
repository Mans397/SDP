package Assignment1;

class Espresso extends Coffee {
    public Espresso() {
        this.name = "Assignment1.Espresso";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing an Assignment1.Espresso...");
    }
}