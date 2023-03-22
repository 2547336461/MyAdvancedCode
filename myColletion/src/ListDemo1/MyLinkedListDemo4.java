package ListDemo1;

import java.util.LinkedList;

public class MyLinkedListDemo4 {
    /*
    public void addFirst(E e)   在该列表开头插入指定的元素
    public void addLast(E e)    将指定的元素追加到此列表的末尾
    public E getFirst()         返回此列表中的第一个元素
    public E getLast()          返回此列表中的最后个元素
    public E removeFirst ()     从此列表中删除并返回第一个元素
    public E removeLast ()      从此列表中删除并返回最后一个元素

     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.addFirst("abc");
        list.addLast("def");
        String s = list.removeFirst();
        String s1 = list.removeLast();
        String first = list.getFirst();
        String last = list.getLast();
        System.out.println(s + s1 + first + last);
        System.out.println(list);
    }
}
