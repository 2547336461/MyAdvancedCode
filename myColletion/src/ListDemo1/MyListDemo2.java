package ListDemo1;

import java.util.ArrayList;
import java.util.List;

public class MyListDemo2 {
    /*
    void add(int index,E element)   在此集合中的指定位置插入指定的元素
    E remove(int index)             删除指定索引处的元素，返回被删除的元素
    E set(int index, E element)     修改指定索引处的元素，返回被修改的元素
    E get(int index)                返回指定索引处的元素
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        // addMethod(list);
        // removeMethod(list);
        // setMethod(list);
        String s = list.get(0);
        System.out.println(s);
    }

    private static void setMethod(List<String> list) {
        // 原索引位置元素不存在了
        String set = list.set(0, "qqq");
        System.out.println(set);
        System.out.println(list);
    }

    private static void removeMethod(List<String> list) {
        // list集合中有两个remove方法：
        //      删除指定元素返回是否删除成功
        //      删除指定索引元素返回被删除元素
        String remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);
    }

    private static void addMethod(List<String> list) {
        // 原来索引位置的元素会后移
        list.add(0, "qqq");
        System.out.println(list);
    }
}
