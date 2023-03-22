package myFactorial;

public class MyFactorialDemo3 {
    public static void main(String[] args) {
        int factorial = getFactorial(10);
        System.out.println(factorial);
    }

    public static int getFactorial(int i) {
        // 递归要有出口
        if (i == 1) {
            return 1;
        } else {
            // 递归的规则
            return i *= getFactorial(i - 1);
        }
    }
}
