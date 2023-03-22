package demo03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();

        // 自己封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println("请输入要发送的数据（输入886退出）：");
            if (str.equals("886")) {
                break;
            } else {
                byte[] bytes = str.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
                        InetAddress.getByName("192.168.1.103"), 10086);
                ds.send(dp);

            }
        }
        ds.close();
    }
}
