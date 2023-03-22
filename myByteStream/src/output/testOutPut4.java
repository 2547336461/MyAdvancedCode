package output;

import java.io.*;

public class testOutPut4 {
    public static void main(String[] args) throws IOException {
        // 缓冲流结合数组进行拷贝
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myByteStream\\a.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\copy1.avi"));
        // 定义数组
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
