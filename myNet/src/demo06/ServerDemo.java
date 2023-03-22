package demo06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        // 监听客户端连接
        Socket s = ss.accept();
        while (true) {
            // 获取输入流
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }
    }
}
