package output;


import java.io.*;

public class testOutPut3 {
    public static void main(String[] args) throws IOException {
        // 创建字节缓冲输出流  需要传入字节流
        // 底层创建了一个（8192）长度的字节数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myByteStream\\a.avi"));
        // 创建字节缓冲输入流
        // 底层创建了一个（8192）长度的字节数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\copy.avi"));
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        // 字节流关闭
        bis.close();
        bos.close();
    }
}
