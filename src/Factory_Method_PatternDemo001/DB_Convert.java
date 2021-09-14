package Factory_Method_PatternDemo001;

public class DB_Convert implements ConvertorFactory{
    @Override
    public Convertor createType() {
        Convertor convertor = new DB_To_XML();
        return convertor;
    }
}
