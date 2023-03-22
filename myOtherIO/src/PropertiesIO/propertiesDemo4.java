package PropertiesIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo4 {
    public static void main(String[] args) throws IOException {
        // 将本地文件中的键值对读取到集合中
        Properties prop = new Properties();
        FileReader fr = new FileReader("myOtherIO\\prop.properties");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
}
