package charStream1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo7 {
    // 一次读取多个字符
    public static void main(String[] args) throws IOException {
        // 创建对象
        FileReader fr = new FileReader("myCharStream\\a.txt");
        char[] chars = new char[1024];
        int len;
        // read方法还是读取，但是一次读取多个字符
        // 他把读到的数据都存入到chars数组
        // 返回值是本次读了多少个字符
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
