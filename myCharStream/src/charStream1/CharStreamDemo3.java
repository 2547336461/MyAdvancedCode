package charStream1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /*
        void write (int c)                          写一个字符
        void write (char[ ] cbuf )                  写出一个字符数组
        void write (char[] cbuf, int off, int len)  写出字符数组的一部分
        void write (String str)                     写一个字符串
        void write (String str, int off, int len)   写一个字符串的一部分

         */
        // 1.创建字节输出流对象
                /*
                注意：
                    如果文件不存在，则会自动创建，但是要保证父级路径存在
                    如果问价存在则会删除原文件，并重新创建
                 */
        // FileWriter fw = new FileWriter(new File("myCharStream\\a.txt"));
        FileWriter fw = new FileWriter("myCharStream\\a.txt");

        // 2.写入数据
                /*
                注意：
                    写出int类型的整数,实际写出的是整数在码表上对应的字母。
                    写出字符串数据,是把字符串本身原样写出。
                 */
        // 一次写入一个字符
        fw.write(96);

        //一次写入一个字符数组
        char[] chars = {97, 98, 99, 100, 102};
        fw.write(chars);

        // 写入数组中一部分
        fw.write(chars, 0, 4);

        // 写一个字符串
        String line = "张宇涛真厉害abc";
        fw.write(line);

        // 写字符串的一部分
        fw.write(line, 0, 3);

        // 3.释放资源
        fw.close();
    }
}
