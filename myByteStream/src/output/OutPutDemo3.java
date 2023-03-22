package output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo3 {
    /*
    void write(int b)                       一次写一个字节数据
    void write(byte[]b)                     一次写一个字节数组数据
    void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myByteStream\\b.txt");
        byte[] bte = {97, 98, 99, 100, 101, 102, 103};
        //fos.write(bte);
        fos.write(bte, 1, 3);
        fos.close();
    }
}
