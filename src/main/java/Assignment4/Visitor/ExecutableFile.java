package Assignment4.Visitor;

public class ExecutableFile implements File {
    private String fileName;

    public ExecutableFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}