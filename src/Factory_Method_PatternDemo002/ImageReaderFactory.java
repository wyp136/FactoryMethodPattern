package Factory_Method_PatternDemo002;

public class ImageReaderFactory implements ReaderFactory{
    @Override
    public Reader createReader() {
        Reader reader = new ImageReader();
        return reader;
    }
}
