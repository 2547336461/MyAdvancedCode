package demo09;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.103",10000);

        // 本地流用来读取文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myNet\\a.txt"));
        // 写到服务器---网络中的流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int b;
        while((b = bis.read()) != -1){
            bos.write(b);   // 通过网络写到服务器
        }
        bos.flush();

        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine())!= null){
            System.out.println(line);
        }
        bis.close();
        socket.close();

    }
}
