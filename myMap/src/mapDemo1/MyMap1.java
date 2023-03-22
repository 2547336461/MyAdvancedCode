package mapDemo1;

import java.util.HashMap;
import java.util.Map;

public class MyMap1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        /*
        1、键不可以重复，值可以重复，键和值是一一对应的
        2、(键+值)这个整体我们称之为"键值对”或者”键值对对象”，
        在Java中叫做"Entry对象”。
         */
        // 添加元素方法
        map.put("001", "张三");
        map.put("002", "李四");
        map.put("003", "王二");
        System.out.println(map);
    }
}
