package PropertiesIO;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("001", "张三");
        prop.put("002", "李四");
        prop.put("003", "王五");
        // 增
        prop.put("005", "老张");
        System.out.println(prop);
        // 删
        prop.remove("003");
        System.out.println(prop);
        // 改
        prop.put("003", "张宇涛");
        System.out.println(prop);
        // 查
        Object o = prop.get("002");
        System.out.println(o);

        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + "+" + value);
        }
        System.out.println("============");
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "+" + value);

        }

    }
}
