package fileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    // 简单来说：只能删除文件或者空文件夹，不支持多级文件夹删除
    public static void main(String[] args) throws IOException {
        //method1();
        File file = new File("D:\\temp\\aaa");
        boolean result = file.delete();
        System.out.println(result);
    }

    private static void method1() {
        File file = new File("D:\\temp\\a.txt");
        boolean result = file.delete();
        System.out.println(result);
    }
}
