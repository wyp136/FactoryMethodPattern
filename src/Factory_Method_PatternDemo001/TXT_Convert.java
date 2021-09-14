package Factory_Method_PatternDemo001;

public class TXT_Convert implements ConvertorFactory{
    @Override
    public Convertor createType() {
        Convertor convertor = new TXT_To_XML();
        return convertor;
    }
}
