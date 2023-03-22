package demo07;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 客户端:数据来自键盘录入，直到输入的数据是886,发送数据结束
        Socket s = new Socket("192.168.1.103", 10000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println("请输入（886退出）：");
            if ("886".equals(str)) {
                break;
            } else {
                // OutputStream os = s.getOutputStream();
                // os.write(str.getBytes());
                bw.write(str);
                bw.newLine();
                bw.flush();
            }

        }
        s.close();
    }
}
