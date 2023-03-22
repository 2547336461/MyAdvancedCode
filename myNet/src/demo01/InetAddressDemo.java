package demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress  此类表示Internet协议(IP) 地址
        // public static InetAddress getByName (String host): 确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        // public String getHostName (): 获取此IP地址的主机名
        // public String getHostAddress (): 返回文本显示中的IP地址字符串
        InetAddress ia =InetAddress.getByName("192.168.1.103");
        String hostAddress = ia.getHostAddress();
        String hostName = ia.getHostName();
        System.out.println(hostName);
        System.out.println(hostAddress);
    }
}
