package genericityGlobbing;

import java.util.ArrayList;

public class GenercityGlobbing {
    /*
    ArrayList<?>:表示元素类型未知的ArrayList,它的元素可以匹配任何的类型
    但是并不能把元素添加到Arraylist中了，获取出来的也是object类型
    类型通配符上限: <? extends类型>
    ArrayList<? extends Number>: 它表示的类型是Number或者其子类型
    类型通配符下限: <? super类型>
    ArrayList<? super Number>: 它表示的类型是Number或者其父类型
     */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        method1(list1);
        method1(list2);
        method1(list3);

        // method2(list1); 超过下限
        method2(list2);
        method2(list3);

        method3(list1);
        // method3(list2); 超过上限
        method3(list3);
    }
    public static void method1(ArrayList<?> list){}
    // 类型通配符下限
    public static void method2(ArrayList<? super Number> list){}
    // 类型通配符上限
    public static void method3(ArrayList<? extends Number> list){}
}
