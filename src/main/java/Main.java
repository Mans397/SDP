import Assignment2.*;
import Assignment2.Adapter.*;
import Assignment2.Bridge.*;
import Assignment2.Composite.*;
import Assignment2.Decorator.*;
import Assignment2.Facade.*;
import Assignment2.Flyweight.*;
import Assignment2.Proxy.*;


public class Main {
    public static void main(String[] args) {

//        Assignment1.CoffeeShop coffeeShop = Assignment1.CoffeeShop.getInstance();
//
//        CoffeeFactory coffeeFactory = new CoffeeFactory();
//        Coffee espresso = coffeeFactory.createCoffee("Espresso");
//        espresso.prepare();
//
//        IngredientFactory latteFactory = new LatteIngredientFactory();
//        Milk milk = latteFactory.createMilk();
//        Syrup syrup = latteFactory.createSyrup();
//
//        Assignment1.CoffeeOrder order1 = new Assignment1.CoffeeOrder(espresso, milk, syrup);
//        order1.displayOrder();
//
//        Assignment1.CoffeeOrder order2 = order1.clone();
//        order2.displayOrder();
//
//        CoffeeBuilder builder = new CoffeeBuilder();
//        Assignment1.CoffeeOrder customOrder = builder.setCoffee(espresso).setMilk(new AlmondMilk()).setSyrup(new VanillaSyrup()).build();
//        customOrder.displayOrder();
//
//        coffeeShop.takeOrder(customOrder.getCoffee());
//        DocumentFacade facade = new DocumentFacade();

        DocumentFacade facade = new DocumentFacade();

        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        facade.displayDocument("Report");

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        facade.displayDocumentWithWatermark("Report");

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        facade.displayDocument("Report");

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        DocumentGroup group = new DocumentGroup();
        group.addDocument(DocumentFactory.getDocument("Report"));
        group.addDocument(DocumentFactory.getDocument("Presentation"));
        group.display();

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        Document pdfDocument = (Document) new PDFDocumentAdapter("document.pdf");
        pdfDocument.display();

        // 6. Использование Bridge для рендеринга
        System.out.println("\n6. Рендеринг документа через движок:");
        RenderEngine simpleEngine = new SimpleRenderEngine();
        facade.renderDocument("Report", simpleEngine);

        RenderEngine highlightEngine = new HighlightRenderEngine();
        facade.renderDocument("Report", highlightEngine);
    }
}