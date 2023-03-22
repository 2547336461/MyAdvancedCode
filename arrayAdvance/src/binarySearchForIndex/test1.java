package binarySearchForIndex;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 23, 34, 45, 56, 67,};
        System.out.println("请输入你要查找的数:");
        int number = sc.nextInt();
        int index = binarySearchForIndex(array, number);
        System.out.println(index);
    }

    public static int binarySearchForIndex(int[] array, int number) {
        int min = 0, max = array.length;
        while (min <= max) {
            int mid = (min + max) >> 1;
            if (number < array[mid]) {
                max = mid - 1;
            } else if (number > array[mid]) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
