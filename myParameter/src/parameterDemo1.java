public class parameterDemo1 {
    public static class test {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int c = 30;
            int sum1 = sum(a, b);
            int sum2 = sum(a, b, c);
            int[] arr = {1, 2, 3, 4, 5};
            int result = sum1(arr);
            System.out.println(result);

        }

        private static int sum1(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }

        // 求2个数的和
        public static int sum(int a, int b) {
            return a + b;
        }

        // 方法重载
        // 求3个数的和
        public static int sum(int a, int b, int c) {
            return a + b + c;
        }
        // 求N个数的和
    }
}
