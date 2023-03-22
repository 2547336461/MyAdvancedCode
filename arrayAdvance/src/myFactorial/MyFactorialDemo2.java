package myFactorial;

public class MyFactorialDemo2 {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    public static int getSum(int i) {
        if (i == 1) {
            return i;
        } else {
            return i += getSum(i - 1);
        }
    }
}
