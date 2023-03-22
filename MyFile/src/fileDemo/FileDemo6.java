package fileDemo;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        File[] pathList = file.listFiles();
        // 进入目标文件夹，获取文件夹里面所有的文件和文件夹的file对象，并把这些file对象都放在一个数组中返回
        // 包括隐藏文件和隐藏文件夹都可以
            //注意事项:
                //1.当调用者是一个文件时 会因返回null
                //2,当调用者是一个空文件夹时 会返回空数组
                //3.当调用者是一个有内容的文件夹时 会正常返回
                //4.当调用者是一个有权限才能进入的文件夹时 会返回null

        for (File path : pathList) {
            System.out.println(path);
        }

    }
}
