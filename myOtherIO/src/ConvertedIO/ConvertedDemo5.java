package ConvertedIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ConvertedDemo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();

    }
}
