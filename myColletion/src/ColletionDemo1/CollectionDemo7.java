package ColletionDemo1;

import java.util.ArrayList;

public class CollectionDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        // 增强for适用于
        for (String s : list) {
            s = "ppp";
            // 注意：此时的s为第三方变量，修改s的值并不会对原数组中的元素修改
            //System.out.println(s);
        }
        System.out.println(list);
    }
}
