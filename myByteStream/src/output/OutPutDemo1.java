package output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo1 {
    public static void main(String[] args) throws IOException {
        // 1.创建字节输出流对象         告诉虚拟机要往哪里写数据
            // 如果文件不存在，则自动会创建
            // 如果文件存在，则会删除清空并重新写入
        FileOutputStream fos = new FileOutputStream("D:\\temp\\a.txt");
        // 两种方法一样效果
        // FileOutputStream fos1 = new FileOutputStream(new File("D:\\temp"))
        // 2.写数据        传递整数时会转换成码表对应的字符
        fos.write(99);
        // 3.释放数据
        // fos.close();
    }
}
