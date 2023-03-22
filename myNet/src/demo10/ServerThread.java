package demo10;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        // 接收数据 写到文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\copy.txt"));

            String Line;
            while((Line = br.readLine()) != null){
                bw.write(Line);
                bw.newLine();
                bw.flush();
            }
            // 给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
