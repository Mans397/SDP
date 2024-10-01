class Latte extends Coffee {
    public Latte() {
        this.name = "Latte";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing a Latte...");
    }
}