import Assignment2.*;
import Assignment2.Adapter.*;
import Assignment2.Bridge.*;
import Assignment2.Composite.*;
import Assignment2.Decorator.*;
import Assignment2.Facade.*;
import Assignment2.Flyweight.*;
import Assignment2.Proxy.*;

import assignment3.Chain.*;
import assignment3.Command.*;
import assignment3.Iterator.*;
import assignment3.Mediator.*;
import assignment3.Memento.*;


import Assignment4.Observer.*;
import Assignment4.State.*;
import Assignment4.Strategy.*;
import Assignment4.TemplateMethod.*;
import Assignment4.Visitor.*;


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






//        DocumentFacade facade = new DocumentFacade();
//
//        // 1. Использование Proxy для ленивой загрузки
//        System.out.println("1. Ленивая загрузка документов:");
//        facade.displayDocument("Report");
//
//        // 2. Использование декоратора для добавления водяного знака
//        System.out.println("\n2. Добавление водяного знака:");
//        facade.displayDocumentWithWatermark("Report");
//
//        // 3. Использование Flyweight для повторного использования документа
//        System.out.println("\n3. Повторное использование документа:");
//        facade.displayDocument("Report");
//
//        // 4. Использование Composite для работы с группой документов
//        System.out.println("\n4. Работа с группами документов:");
//        DocumentGroup group = new DocumentGroup();
//        group.addDocument(DocumentFactory.getDocument("Report"));
//        group.addDocument(DocumentFactory.getDocument("Presentation"));
//        group.display();
//
//        // 5. Использование Adapter для работы с PDF
//        System.out.println("\n5. Работа с PDF документами через Adapter:");
//        Document pdfDocument = (Document) new PDFDocumentAdapter("document.pdf");
//        pdfDocument.display();
//
//        // 6. Использование Bridge для рендеринга
//        System.out.println("\n6. Рендеринг документа через движок:");
//        RenderEngine simpleEngine = new SimpleRenderEngine();
//        facade.renderDocument("Report", simpleEngine);
//
//        RenderEngine highlightEngine = new HighlightRenderEngine();
//        facade.renderDocument("Report", highlightEngine);






//        // Chain
//        PaymentHandler paymentA = new PaymentA();
//        PaymentHandler paymentB = new PaymentB();
//        PaymentHandler paymentC = new PaymentC();
//
//        //Creating chain
//        paymentA.setNext(paymentB).setNext(paymentC);
//
//        //Starting the chain
//        paymentA.handle(210);
//
//        System.out.println();
//        //Command
//        Television television = new Television();
//        RemoteControl remoteControl = new RemoteControl();
//
//        remoteControl.setCommand("TurnOn", new TurnOnCommand(television));
//        remoteControl.setCommand("TurnOff", new TurnOffCommand(television));
//        remoteControl.setCommand("VolumeUp", new VolumeUpCommand(television));
//        remoteControl.setCommand("VolumeDown", new VolumeDownCommand(television));
//        remoteControl.setCommand("NextChannel", new NextChannelCommand(television));
//        remoteControl.setCommand("PrevChannel", new PreviousChannelCommand(television));
//
//        remoteControl.buttonPressed("TurnOn");
//        remoteControl.buttonPressed("VolumeUp");
//        remoteControl.buttonPressed("NextChannel");
//        remoteControl.buttonPressed("VolumeDown");
//        remoteControl.buttonPressed("PrevChannel");
//        remoteControl.buttonPressed("TurnOff");
//        remoteControl.buttonPressed("Unknown Command");
//
//        System.out.println();
//
//        //Iterator
//        ListMovieCollection listCollection = new ListMovieCollection();
//        listCollection  .addMovie("Avengers")
//                .addMovie("Iron man")
//                .addMovie("Thor");
//
//        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(3);
//        arrayCollection .addMovie("Matrix")
//                .addMovie("Inside out")
//                .addMovie("Spider-man");
//
//        Iterator<String> listIterator = listCollection.createIterator();
//        System.out.println("Movies from List:");
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//
//        Iterator<String> arrayIterator = arrayCollection.createIterator();
//        System.out.println("\nMovies from Array:");
//        while (arrayIterator.hasNext()) {
//            System.out.println(arrayIterator.next());
//        }
//
//        System.out.println();
//
//        //Mediator
//
//        HomeMediator mediator = new HomeMediatorImpl();
//
//        Sensor temperatureSensor = new TemperatureSensor(mediator);
//        Sensor humiditySensor = new HumiditySensor(mediator);
//        Sensor lightSensor = new LightSensor(mediator);
//
//        temperatureSensor.sendData();
//        humiditySensor.sendData();
//        lightSensor.sendData();
//
//        mediator.printReport();
//
//        System.out.println();
//
//        // Memento
//
//        TextEditor editor = new TextEditor();
//        Caretaker caretaker = new Caretaker();
//
//        editor.addText("Hello, world!");
//        editor.showText();
//
//        caretaker.save(editor);
//
//        editor.addText(" Something");
//        editor.showText();
//
//        caretaker.restore(editor);
//        editor.showText();


        //Observer
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        // Подписка
        newsPublisher.subscribe(smartphoneSubscriber);
        newsPublisher.subscribe(laptopSubscriber);
        newsPublisher.subscribe(tabletSubscriber);

        // Публикация новостей
        newsPublisher.publishNews("Спорт", "Барселона выиграла матч!");
        newsPublisher.publishNews("Наука", "Открытие новой планеты!");
        newsPublisher.publishNews("Политика", "Новое правительство избрано.");

        System.out.println();

        //State
        Player player = new Player();

        // Попробуем воспроизвести, поставить на паузу и остановить трек
        player.play();   // Воспроизведение трека
        player.pause();  // Пауза
        player.play();   // Возобновление воспроизведения
        player.stop();   // Остановка
        player.pause();  // Попытка поставить на паузу, когда плеер остановлен

        System.out.println();

        //Strategy
        Order order = new Order(1000); // Сумма заказа 1000 рублей

        // Оплата банковской картой
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Final price with card: " + order.calculateTotal());

        // Оплата электронным кошельком
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Final price with wallet: " + order.calculateTotal());

        // Наложенный платёж
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Final price with cash on delivery: " + order.calculateTotal());

        System.out.println();

        //TemplateMethod
        QualityCheck foodCheck = new FoodQualityCheck();
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();

        // Проверка продукта питания
        System.out.println("Food Quality Check:");
        foodCheck.checkProduct();

        // Проверка электроники
        System.out.println("\nElectronics Quality Check:");
        electronicsCheck.checkProduct();

        System.out.println();

        //visitor

        // Создаём файлы
        File textFile = new TextFile("This is a text file content");
        File executableFile = new ExecutableFile("program.exe");

        // Создаём посетителей
        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        // Проверка антивирусом
        System.out.println("Antivirus check:");
        textFile.accept(antivirus);
        executableFile.accept(antivirus);

        // Генерация отчёта
        System.out.println("\nGenerating report:");
        textFile.accept(report);
        executableFile.accept(report);
    }
}