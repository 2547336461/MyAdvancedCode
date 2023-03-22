package ListDemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
