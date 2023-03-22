package PropertiesIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class propertiesDemo3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.put("123", "321");
        prop.put("456", "654");
        prop.put("789", "987");
        FileWriter fw = new FileWriter("myOtherIO\\prop.properties");
        // 将集合中的数据以键值对的形式保存到本地文件中
        prop.store(fw, "");
        fw.close();
    }
}
