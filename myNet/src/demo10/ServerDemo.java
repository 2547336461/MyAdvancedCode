package demo10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10000);
        // 监听客户端连接，返回对应的Socket对象
        while(true){
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }

    }
}
