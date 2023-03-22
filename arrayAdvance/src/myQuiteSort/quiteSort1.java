package myQuiteSort;

public class quiteSort1 {
    public static void main(String[] args) {
        int[] array = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        quiteSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quiteSort(int[] array, int left, int right) {
        int leftTemp = left;
        int rightTemp = right;
        // 计算基准数
        int bestNumber = array[leftTemp];
        while (left != right) {
            // 从右开始找比基准数小的
            while (array[right] >= bestNumber && right > left) {
                right--;
            }
            // 从左开始找比基准数大的
            while (array[left] <= bestNumber && right > left) {
                left++;
            }
            // 交换两个值
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        // 基准数归位
        int temp = array[left];
        array[left] = array[leftTemp];
        array[leftTemp] = temp;
    }
}
