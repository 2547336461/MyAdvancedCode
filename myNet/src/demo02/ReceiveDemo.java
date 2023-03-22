package demo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 1:创建接收端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(10086);
        //2:创建一个数据包， 用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //3 :调用DatagramSocket对象的方法接收数据
        ds.receive(dp);
        //4:解析数据包，并把数据在控制台显示
        // 返回数据缓冲区
        byte[] data = dp.getData();
        // 接收数据包长度为1024，但实际没有用到，后面则会乱码
        // 判断数据的实际长度，传给下面方法，实现数据正确转换
        int dataLen = dp.getLength();
        String dataString = new String(data,0,dataLen);
        System.out.println("Data Is:" + dataString);
        //5:关闭接收端
        ds.close();
    }
}
