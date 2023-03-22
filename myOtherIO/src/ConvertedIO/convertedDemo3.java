package ConvertedIO;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class convertedDemo3 {
    public static void main(String[] args) throws IOException {
        User user = new User("zhangSan","123qwe");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myOtherIO\\a.txt"));
        oos.writeObject(user.getUserName());
        oos.close();

    }
}
