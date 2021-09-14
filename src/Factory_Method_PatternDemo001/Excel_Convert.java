package Factory_Method_PatternDemo001;

public class Excel_Convert implements ConvertorFactory {
    @Override
    public Convertor createType() {
        Convertor convertor = new Excel_To_XML();
        return convertor;
    }
}
