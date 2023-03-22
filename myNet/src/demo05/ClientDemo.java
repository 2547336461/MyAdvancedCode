package demo05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 创建客户端Socket对象
        Socket s = new Socket("192.168.1.104", 10086);
        // 获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
        // 接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data = new String(bytes, 0, len);
        System.out.println("Client：" + data);
        s.close();
    }
}
