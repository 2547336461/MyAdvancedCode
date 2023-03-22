public class exceptionDemo9 {
    public static void main(String[] args) {
        int[] Array = null;
        try {
            Print(Array);
        } catch (NullPointerException exception) {
            // 如果出现异常，做出如下处理
            System.out.println("参数不能为空");
        }
        System.out.println("嘿嘿，代码可以继续运行");

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
