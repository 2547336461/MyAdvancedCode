package mapDemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "zhangSan1");
        map.put("002", "lisi1");
        map.put("003", "wangEr1");
        map.put("004", "MaZi1");
        map.put("005", "laoLiu1");

        // 首先获取到所有的键值对对象（整体）
        // Set集合中装的是键值对对象(Entry对象)
        // 而Entry里面装的是键和值
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }
}
