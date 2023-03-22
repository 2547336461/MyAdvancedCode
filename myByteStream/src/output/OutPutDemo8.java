package output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OutPutDemo8 {
    public static void main(String[] args) throws IOException {
        // 如果文件不存在则会报错
        FileInputStream fis = new FileInputStream("MyByteStream\\a.txt");
        // 一次读取一个字节，返回值就是该字节
        int read = fis.read();
        // 想要看到字符数据需要强转
        System.out.println((char) read);
        fis.read();
    }
}
