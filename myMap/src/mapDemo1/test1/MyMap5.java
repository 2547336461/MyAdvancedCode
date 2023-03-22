package mapDemo1.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap5 {
    public static void main(String[] args) {
        HashMap<Student, String> mapList = new HashMap<>();
        Student st1 = new Student("001", "张宇涛");
        mapList.put(st1, "安徽");
        Student st2 = new Student("002", "老王");
        mapList.put(st2, "湖北");
        Student st3 = new Student("003", "小李");
        mapList.put(st3, "浙江");
        // 方法一：先获取到所有键值对对象，再通过键值对获得键和值
        Set<Map.Entry<Student, String>> entries = mapList.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=");
        // 方法二：先获取到所有键，再通过键获取每一个值
        Set<Student> keys = mapList.keySet();
        for (Student key : keys) {
            String value = mapList.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=");
        // 方法三：lambda表达式
        mapList.forEach(
                (Student key, String value) -> {
                    System.out.println(key + "---" + value);
                }
        );
    }
}
