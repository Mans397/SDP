class Espresso extends Coffee {
    public Espresso() {
        this.name = "Espresso";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing an Espresso...");
    }
}