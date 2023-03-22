package fileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //public boolean createNewFile()创建一个新的空的文件
        //public boolean mkdir( )创建一个单级文件夹
        //public boolean mkdirs( )创建一个多级文件夹
         method1();
         method2();
         method3();
    }

    private static void method3() {
        //1.可以创建单级文件夹,也可以创建多级文件夹
        //2.不管调用者有没有后缀名，只能创建文件夹
        File file = new File("D:\\study\\java\\daima\\bbb\\aaa\\111" );
        boolean result = file.mkdirs();
        System.out.println(result);
    }

    private static void method2() {
        //1.只能创建单级文件夹,不能创建多级文件夹
        //2.不管调用者有没有后缀名，只能创建单级文件夹
        File file = new File("D:\\study\\java\\daima\\aaa" );
        boolean result = file.mkdir();
        System.out.println(result);
    }

    private static void method1() throws IOException {
        File file = new File("D:\\study\\java\\daima\\a.txt" );
        boolean result = file.createNewFile();
        System.out.println(result);
        // 文件已经存在，创建失败返回false，文件不存在，创建成功返回true，
        // createNewFile()不管调用者有没有后缀名，只能创建文件
    }
}
