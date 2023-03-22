package ColletionDemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        // 1.数据类型一定是集合或数组中的元素类型
        // 2.s只是变量名而已，依次表示集合或数组中每一个元素
        // 3.list表示将要遍历的数组或集合
        for (String s : list) {
            System.out.println(s);
        }
    }
}
