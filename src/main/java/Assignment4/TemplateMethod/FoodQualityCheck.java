package Assignment4.TemplateMethod;

public class FoodQualityCheck extends QualityCheck {

    @Override
    protected void checkSpecificQuality() {
        System.out.println("Checking expiration date and ingredients...");
    }
}
