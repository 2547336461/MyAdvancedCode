package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo6 {
    public static void main(String[] args) throws IOException {
        // 第二个参数相当于续写开关，默认false
        FileOutputStream fos = new FileOutputStream("myByteStream\\d.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write(i+63);
        }
        fos.close();
    }
}
