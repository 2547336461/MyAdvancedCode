package output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OutPutDemo9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myByteStream\\a.txt");
        int b = 0;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }
        fis.close();
    }
}
