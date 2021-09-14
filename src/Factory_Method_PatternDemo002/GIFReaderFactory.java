package Factory_Method_PatternDemo002;

public class GIFReaderFactory implements ReaderFactory{
    @Override
    public Reader createReader() {
        Reader reader = new GIFReader();
        return reader;
    }
}
