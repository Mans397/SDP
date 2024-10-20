package Assignment4.TemplateMethod;

public class ElectronicsQualityCheck extends QualityCheck {

    @Override
    protected void checkSpecificQuality() {
        System.out.println("Checking functionality and warranty...");
    }
}
