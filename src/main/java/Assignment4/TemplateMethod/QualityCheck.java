package Assignment4.TemplateMethod;

public abstract class QualityCheck {

    // Шаблонный метод, определяющий общий процесс проверки
    public final void checkProduct() {
        checkAppearance();        // Шаг 1: Проверка внешнего вида (одинаковая для всех)
        checkSpecificQuality();   // Шаг 2: Проверка специфических характеристик (для разных продуктов своя)
        generateReport();         // Шаг 3: Заключительный отчёт (одинаковый для всех)
    }

    // Шаг 1: Проверка внешнего вида (реализован в базовом классе)
    private void checkAppearance() {
        System.out.println("Checking appearance of the product...");
    }

    // Шаг 2: Проверка специфических характеристик (абстрактный метод)
    protected abstract void checkSpecificQuality();

    // Шаг 3: Заключительный отчёт (реализован в базовом классе)
    private void generateReport() {
        System.out.println("Generating quality check report...");
    }
}
