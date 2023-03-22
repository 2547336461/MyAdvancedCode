package myBubbleSort;

public class test1 {
    public static void main(String[] args) {
        int[] array = {23, 22, 21, 34, 22, 113, 3345,};
        bubble(array);
    }

    public static void bubble(int[] array) {
        //外层循环控制次数，比数组长度少1
        for (int i = 0; i < array.length - 1; i++) {
            // 内层循环是比较算法
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
