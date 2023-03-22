package ColletionDemo1;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        System.out.println(Arrays.toString(array1));
        String[] array2 = {"a", "b", "c"};
        System.out.println(Arrays.toString(array2));

        ArrayList<String> array3 = new ArrayList<>();
        array3.add("a");
        array3.add("b");
        array3.add("c");
        System.out.println(array3);
        // 如果集合要存储基本数据类型，那么实际存储的是他们的包装类。
        ArrayList<Integer> array4 = new ArrayList<Integer>();
        array4.add(1);
        array4.add(2);
        array4.add(3);
        System.out.println(array4);

    }
}
