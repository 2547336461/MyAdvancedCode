public class parameterDemo2 {
    public static void main(String[] args) {
        // 求N个数的和
        // 可变参数实现
        int sum = getSum(1, 2, 3, 4, 5, 6, 7, 78, 89, 0, 0, 7, 8);
        System.out.println(sum);
    }

    // 如果有普通参数 需要将普通参数放在可变参数前面
    public static int getSum(int num,int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
