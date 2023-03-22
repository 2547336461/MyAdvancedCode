package charStream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo11 {
    public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\a.txt"));
    bw.write("hello");
    // 字符缓冲流的特有功能  跨平台的回车换行
    bw.newLine();
    bw.write("word");
    bw.newLine();
    // 刷新流
    bw.flush();
    // 释放资源
    bw.close();
    }

}
