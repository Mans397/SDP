package Assignment4.Visitor;

public class AntivirusVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Scanning text file for forbidden words: " + textFile.getContent());
        // Логика поиска запрещённых слов
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Scanning executable file for malicious code: " + executableFile.getFileName());
        // Логика проверки исполняемых файлов
    }
}