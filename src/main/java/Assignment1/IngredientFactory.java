package Assignment1;

//абстрактная фабрика
interface IngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}