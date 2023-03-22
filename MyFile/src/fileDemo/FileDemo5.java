package fileDemo;

import java.io.File;

public class FileDemo5 {
    /*
    //public boolean isDirectory()  测试此抽象路径名表示的File是否为目录
    //public boolean isFile()       测试此抽象路径名表示的File是否为文件
    //public boolean exists( )      测试此抽象路径名表示的File是否存在
    //public string getName()       返回由此抽象路径名表示的文件或目录的名称
        //注意点:
            //1.如果调用者是文件，那么获取的是文件名和后缀名
            //2.如果调用者是一个文件夹，那么获取的是文件夹的名字

     */
    public static void main(String[] args) {
        //method1();
        //method2();
        // method3();
        File file = new File("D:temp\\a.txt");
        String name = file.getName();
        System.out.println(name);
    }

    private static void method3() {
        File file = new File("a.txt");
        boolean exists = file.exists();
        System.out.println(exists);
    }

    private static void method2() {
        File file = new File("D:\\temp");
        boolean result = file.isFile();
        boolean result2 = file.isDirectory();
        System.out.println(result);
        System.out.println(result2);
    }

    private static void method1() {
        File file = new File("D:\\temp\\a.txt");
        boolean result = file.isFile();
        boolean result2 = file.isDirectory();
        System.out.println(result);
        System.out.println(result2);
    }
}
