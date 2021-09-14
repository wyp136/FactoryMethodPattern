package Factory_Method_PatternDemo002;

public class JPGReader implements Reader{
    @Override
    public void reader() {
        System.out.println("-----正在读取JPG图片信息-----");
    }
}
