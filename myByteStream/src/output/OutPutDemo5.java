package output;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myByteStream\\c.txt");
        for (int i = 0; i < 64; i++) {
            fos.write(i + 63);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
