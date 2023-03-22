package demo02;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端的Socket对象(DatagramSocket)
        // DatagramSocket ()    构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket();
        // 创建数据 把数据打包
        // DatagramPacket (byte[] buf, int Length, InetAddress address, int port)
        byte[] bytes = "hello,upd".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.104"), 10086);
        // 调用DatagramSocket对象的发送数据
        ds.send(dp);
        // 关闭发送端
        ds.close();
    }
}
