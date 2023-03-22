package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo7 {
    /*
    void write(int b)                       一次写一个字节数据
    void write(byte[]b)                     一次写一个字节数组数据
    void write(byte[] b, int off, int len)  一次写一个字节数组的部分数据
     */
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //System.out.println(2/0);
            fos = new FileOutputStream("myByteStream\\b.txt");
            fos.write(99);
        } catch (IOException e) {
            e.printStackTrace();
            // 无论是否异常都会运行finally里的内容
        } finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
