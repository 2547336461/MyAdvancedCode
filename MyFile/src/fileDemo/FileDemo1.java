package fileDemo;

import java.io.File;

public class FileDemo1 {
    /*
    File (String pathname)               通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
    File (String parent, String child)   从父路径名字符串和子路径名 字符串创建新的File实例
    File (File parent, string child)     从父抽象路径名和子路径名字符串创建新的File实例
     */
    public static void main(String[] args) {
        // method1();
        // method2();
        // method3();
    }

    private static void method3() {
        File file1 = new File("D:\\study\\java\\daima" );
        String path = "a.txt";
        File file = new File(file1, path);
        System.out.println(file);
    }

    private static void method2() {
        String path1 = "D:\\study\\java\\daima";
        String path2 = "a.txt";
        File file = new File(path1, path2);
        System.out.println(file);
    }

    private static void method1() {
        String path = "D:\\study\\java\\daima\\a.txt";
        // 通过给定的路径名转化为抽象路径来创建File实例
        File file = new File(path);
    }
}
