package output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class testOutPut2 {
    // 将D:\temp\a.avi拷贝到项目下
    // 代码优化，一次读取多个字节可以提高数据拷贝速率
    public static void main(String[] args) throws IOException {
        // 创建字节输入流 读数据
        FileInputStream fis = new FileInputStream("D:\\temp\\a.avi");
        // 创建字节输出流 写数据
        FileOutputStream fos = new FileOutputStream("myByteStream\\a.avi");
        byte[] bytes = new byte[1024];
        // 定义每次读取的有效个数
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
