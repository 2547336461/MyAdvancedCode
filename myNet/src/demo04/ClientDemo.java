package demo04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        /*
        1:创建客户端的Socket对象(Socket)
        2:获取输出流，写数据
        3:释放资源
         */
        // 创建客户端Socket对象
        Socket s = new Socket("192.168.1.104",10086);
        //Socket (String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号
        // 获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp".getBytes());

        s.close();

    }
}
