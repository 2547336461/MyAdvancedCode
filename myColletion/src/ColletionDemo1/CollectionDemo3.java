package ColletionDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");
        list.add("f");
        // 获取迭代器对象
        // 迭代器对象一旦被创建，就会默认指向集合0号索引位置
        Iterator<String> it = list.iterator();
        // 利用迭代器里面的方法进行遍历
        // 当前位置是否有元素可以被取出
        System.out.println(it.hasNext());
        // 取出当前位置的元素，并且迭代器指向下一个元素
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
