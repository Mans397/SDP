package Assignment1;

class Latte extends Coffee {
    public Latte() {
        this.name = "Assignment1.Latte";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing a Assignment1.Latte...");
    }
}