package Catch;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        st.setName(name);
        while (true) {
            System.out.println("请输入年龄：");
            String ageStr = sc.nextLine();
            try {
                int ageNum = Integer.parseInt(ageStr);
                st.setAge(ageNum);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入整数。");
                continue;
            } catch (AgeOutOfBoundsException e) {
                System.out.println("请输入范围内的数值");
                continue;
            }
        }
        System.out.println(st);
    }
}
