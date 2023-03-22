package demo04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    /*
    1 :创建服务器端的Socket对象(ServerSocket)
    2:获取输入流,读数据,并把数据显示在控制台
    3 :释放资源
     */
    public static void main(String[] args) throws IOException {
        // 1 :创建服务器端的Socket对象(ServerSocket)
        ServerSocket ss = new ServerSocket(10086);
        // 侦听要连接到此套接字并接受它
        Socket s = ss.accept();
        //获取输入流，读数据，并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String str = new String(bytes,0,len);
        System.out.println(str);
        //  释放资源
        ss.close();
    }
}
