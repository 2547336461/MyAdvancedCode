package myArrays;

import java.util.Arrays;

public class test1 {
    /*
public static String toString(int[] a)          返回指定数组的内容的字符串表示形式
public static void sort(int[] a)                按照数字顺序排列指定的数组
public static int binarySearch(int[] a,int key) 利用二分查找返回指定元素的索引
     */
    public static void main(String[] args) {
        int[] array = {3, 6, 1, 9, 2, 0};
        // 返回指定数组的内容的字符串表示形式
        System.out.println(Arrays.toString(array));
        // 按照数字顺序排列指定的数组
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // 利用二分查找返回指定元素的索引
        /*
        1.数组必须有序
        2.如果元素存在，那么返回实际索引
        3.如果元素不存在，那么返回(插入点-1)
         */
        int index = Arrays.binarySearch(array, 4);
        System.out.println(index);
    }
}
