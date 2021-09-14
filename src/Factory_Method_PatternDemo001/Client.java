package Factory_Method_PatternDemo001;

public class Client {
    public static void main(String[] args) {
        Convertor convertor;
        ConvertorFactory convertorfactory;
        convertorfactory = new DB_Convert();
        convertor = convertorfactory.createType();
        convertor.Transform();
    }
}
