package ColletionDemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        // 老方法删除集合元素
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            if ("aaa".equals(next)){
                // 只想谁就删除谁
                it.remove();
            }
        }
        System.out.println(list);
    }
}
