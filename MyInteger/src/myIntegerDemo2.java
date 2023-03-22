public class myIntegerDemo2 {
    public static void main(String[] args) {
        String s1 = "100";
        int i2 = 100;
        int i = Integer.parseInt(s1);
        System.out.println(i + i2);

        // int 转化为String
        // 1
        int i3 = 200;
        String s2 = i3 + "";
        System.out.println(s2 + 100);
        // String类中的valueOf方法
        String s = String.valueOf(i3);
        System.out.println(s + 100);

    }
}
