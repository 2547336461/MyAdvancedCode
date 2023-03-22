package FileTest;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("MyFile//aaa");

        if (!file1.exists()) {
            file1.mkdirs();
        }
        File file = new File(file1, "a.txt");
        boolean result = file.createNewFile();
        System.out.println(result);

    }
}
