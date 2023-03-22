package FileTest;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\temp");
        // 采用递归方法
        deleteDir(src);
    }

    public static void deleteDir(File src) {
        // 创建File对象
        File[] files = src.listFiles();
        // 用增强for循环遍历对象
        for (File file : files) {
            // 对每一个对象 判断是文件还是文件夹
            if (file.isFile()) {
                // 如果是文件直接删除
                file.delete();
            } else {
                // 如果是文件夹就进入嵌套，调用自身
                deleteDir(file);
            }
        }
        // 把自己删除
        src.delete();
    }
}
