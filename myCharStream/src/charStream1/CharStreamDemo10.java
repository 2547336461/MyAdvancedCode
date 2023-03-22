package charStream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo10 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\a.txt"));
        bw.write(97);
        bw.write("\r\n");
        bw.write("张宇涛");
        bw.write("\r\n");
        bw.write("good", 0, 2);
        bw.write("\r\n");
        char[] chars = {97, 98, 99, 100};
        bw.write(chars);
        bw.write("\r\n");
        bw.flush();
        bw.close();
    }
}
