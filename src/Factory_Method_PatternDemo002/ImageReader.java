package Factory_Method_PatternDemo002;

public class ImageReader implements Reader{
    @Override
    public void reader() {
        System.out.println("-----正在读取Image图片信息-----");
    }
}
