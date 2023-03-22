package charStream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo6 {
    public static void main(String[] args) throws IOException {
        // 创建字节流输入对象
        FileReader fr = new FileReader("myCharStream\\a.txt");
        int b;
        while ((b = fr.read()) != -1) {
            System.out.println((char) b);
        }
        fr.close();
    }
}
