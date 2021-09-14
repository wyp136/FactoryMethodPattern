package Factory_Method_PatternDemo002;

public class Client{
    public static void main(String[] args) {
        Reader reader;
        ReaderFactory readerfactory;
        readerfactory = new GIFReaderFactory();
        reader = readerfactory.createReader();
        reader.reader();
    }
}
