package ColletionDemo1;

import java.util.ArrayList;

public class CollectionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        // 老方法删除集合元素
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if ("aaa".equals(s)) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println(arrayList);
    }
}
