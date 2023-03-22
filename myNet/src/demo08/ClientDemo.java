package demo08;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.103", 10000);
        BufferedReader br = new BufferedReader(new FileReader("myNet\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String Line;
        while ((Line = br.readLine()) != null) {
            bw.write(Line);
            bw.newLine();
            bw.flush();
        }
        s.close();
        br.close();
    }
}
