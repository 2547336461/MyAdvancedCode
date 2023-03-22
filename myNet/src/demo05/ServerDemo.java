package demo05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10086);
        // 监听客户端连接，返回Socket对象
        Socket s = ss.accept();
        // 获取输入流，读数据，并打印
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("Server：" + data);
        // 给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到".getBytes());

        // 释放资源
        s.close();
    }
}
