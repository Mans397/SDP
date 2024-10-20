package Assignment4.Visitor;

public class ReportVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating report for text file: " + textFile.getContent());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Generating report for executable file: " + executableFile.getFileName());
    }
}