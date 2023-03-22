package charStream1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\a.txt"));
        // 特有功能:读取一整行、
        // 读不到数据就会返回null 与普通返回值-1不同
        String line1 = br.readLine();
        // 原理就是，一直读到换行符停止，但不会读取换行符
        String line2 = br.readLine();
        String line3 = br.readLine();

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
    }
}
