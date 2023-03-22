package demo07;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10000);
        // 监听客户端连接
        Socket s = ss.accept();
        // 接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\a.txt"));

        String Line;
        while((Line = br.readLine()) != null){
            bw.write(Line);
            bw.newLine();
            bw.flush();
        }
        // 释放资源
        bw.close();
        ss.close();
    }
}
