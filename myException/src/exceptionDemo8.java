public class exceptionDemo8 {
    public static void main(String[] args) {
        int[] Array = null;
        Print(Array);
    }

    public static void Print(int[] array) {
        if (array == null) {
            // 当参数为null时，手动创建了一个异常对象，抛给调用者
            throw new NullPointerException();
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
