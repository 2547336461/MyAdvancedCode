package PropertiesIO;

import java.util.Properties;
import java.util.Set;

public class propertiesDemo2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("001", "000");
        prop.setProperty("002", "000");
        prop.setProperty("003", "333");
        System.out.println(prop);
        String value = prop.getProperty("002");
        System.out.println(value);
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String property = prop.getProperty(key);
            System.out.println(key + " + " + property);
        }
    }
}
