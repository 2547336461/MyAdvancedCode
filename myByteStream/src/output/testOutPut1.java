package output;

import java.io.*;

public class testOutPut1 {
    // 将D:\temp\a.avi拷贝到项目下
    public static void main(String[] args) throws IOException {
        File OldFile = new File("D:\\temp\\a.avi");
        File NewFile = new File("myByteStream\\a.avi");
        // 创建字节输入流 读数据
        FileInputStream fis = new FileInputStream(OldFile);
        // 创建字节输出流 写数据
        FileOutputStream fos = new FileOutputStream(NewFile);
        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
