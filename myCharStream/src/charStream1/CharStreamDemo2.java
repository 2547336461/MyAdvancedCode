package charStream1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharStreamDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // method1();
        method2();
    }

    private static void method2() throws UnsupportedEncodingException {
    /*
    string (byte[] bytes):通过使用平台的默认字符集解
    码指定的字节数组来构造新的string
    string (byte[] bytes, string charsetName):通过指定的字符集解码
    指定的字节数组来构造新的string
     */
        byte[] bytes1 = {-27, -68, -96, -27, -82, -121, -26, -74, -101};
        byte[] bytes2 = {-43, -59, -45, -18, -52, -50};
        // 默认utf-8格式解码
        String str1 = new String(bytes1);
        System.out.println(str1);
        // 指定gbk格式解码
        String str2 = new String(bytes2, "gbk");
        System.out.println(str2);
    }

    private static void method1() throws UnsupportedEncodingException {
    /*
    byte[] getBytes ():使用平台的默认字符集将该String编码为一系列字节，
    将结果存储到新的字节数组中
    byte[] getBytes (string charsetName):使用指定的字符集将该string编码为一系列字节，
    将结果存储到新的字节数组中
     */
        String str = "张宇涛";
        // 默认使用UTF-8编码格式，中文储存三个字节
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));
        // 指定以GBK格式编码后，中文储存两个字节
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
    }
}
