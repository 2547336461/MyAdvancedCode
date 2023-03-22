public class exceptionDemo11 {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);
            String string = e.toString();
            System.out.println(string);
            e.printStackTrace();
        }
        System.out.println("嘿嘿嘿 程序没有结束");
    }
}
