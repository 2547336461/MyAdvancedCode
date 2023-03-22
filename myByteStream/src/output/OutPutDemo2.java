package output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myByteStream\\a.txt");
        for (int i = 0; i < 64; i++) {
            fos.write(i+63);
        }
        fos.close();
    }
}
