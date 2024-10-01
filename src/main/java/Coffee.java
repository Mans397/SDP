// здесь используется фабричный метод
abstract class Coffee {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract void prepare();
}