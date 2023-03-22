package charStream1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\a.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
