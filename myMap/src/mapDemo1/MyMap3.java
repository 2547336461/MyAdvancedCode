package mapDemo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "zhangSan");
        map.put("002", "lisi");
        map.put("003", "wangEr");
        map.put("004", "MaZi");
        map.put("005", "laoLiu");

        // 获取到所有的键
        Set<String> keys = map.keySet();
        // 遍历Set集合得到每一个键
        for (String key : keys) {
            // 通过每一个键得到每一个对应的值
            String value = map.get(key);
            System.out.println(key + "-----" + value);
        }
    }
}
