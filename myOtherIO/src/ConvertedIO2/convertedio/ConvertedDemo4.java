package ConvertedIO2.convertedio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ConvertedDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        User o = (User) ois.readObject();
        System.out.println(o);
        ois.close();

    }
}
