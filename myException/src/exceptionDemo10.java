import java.util.Scanner;

public class exceptionDemo10 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            System.out.println(num);
            System.out.println(2 / 0);
            // 注意点：如果多个异常之间存在子父关系，父类应该写在下面
            // 针对不同异常，有不同的处理方式
        } catch (NumberFormatException e) {
            System.out.println("格式化异常");
        } catch (ArithmeticException e) {
            System.out.println("数字运算异常");
        }
        System.out.println("测试456");
    }
}
