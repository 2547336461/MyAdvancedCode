package ConvertedIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class convertedDemo1 {
    public static void main(String[] args) throws IOException {
        // 对象流的基本特点:    对象的信息原封不动保存到文件中 不安全
        User user = new User("张三", "123");
        BufferedWriter bw = new BufferedWriter(new FileWriter("myOtherIO\\a.txt"));
        bw.write(user.getUserName());
        bw.newLine();
        bw.write(user.getPassWord());
        bw.close();
    }
}
