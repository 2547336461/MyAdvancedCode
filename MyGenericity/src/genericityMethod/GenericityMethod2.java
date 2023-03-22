package genericityMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericityMethod2 {
    public static void main(String[] args) {
        ArrayList<String> list = method(new ArrayList<String>(), "a", "b", "c", "d");
        System.out.println(list);

        ArrayList<Integer> list1 = method(new ArrayList<Integer>(), 1, 2, 3, 4);
        System.out.println(list1);
    }

    public static <T> ArrayList<T> method(ArrayList<T> list, T a, T b, T c, T d) {
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        return list;
    }
}
