package charStream1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamDemo8 {
    public static void main(String[] args) throws IOException {
        //将键盘录入的用户名和密码保存到本地实现永久化存储
        //要求:用户名独占一行，密码独占一行
        // 分析:
        //1，实现键盘录入，把用户名和密码录入进来
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String user = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        //2.分别把用户名和密码写到本地文件。
        FileWriter fw = new FileWriter("myCharStream\\b.txt");
        fw.write(user);
        // 输入回车换行符
        fw.write("\r\n");
        fw.flush();
        fw.write(password);
        fw.write("\r\n");
        fw.close();
    }
}
