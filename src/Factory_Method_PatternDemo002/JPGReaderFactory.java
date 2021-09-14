package Factory_Method_PatternDemo002;

public class JPGReaderFactory implements ReaderFactory{
    @Override
    public Reader createReader() {
        Reader reader = new JPGReader();
        return reader;
    }
}
