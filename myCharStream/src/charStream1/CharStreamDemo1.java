package charStream1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
//        File file = new File("myCharStream\\a.txt");
//        file.createNewFile();
        FileInputStream fis =new FileInputStream("myCharStream\\a.txt");
        int b;
        while((b = fis.read()) != -1){
            // 乱码 因为字节流读取中文每次只会读取一个字节，但是中文在编码时，无论是utf-8(3个字节)还是gbk(2个字节)都是多个字节
            System.out.println((char) b);
        }
        fis.close();
    }
}
