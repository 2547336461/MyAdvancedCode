package myClassLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderDemo02 {
    public static void main(String[] args) throws IOException {
        //  static ClassLoader getSystemClassLoader() 获取系统类加载器
        //  InputStream getResourceAsStream(String name)加载某一个资源文件
        // 获取系统加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // 利用加载器加载指定文件
        // 参数：文件路径
        // 返回：字节流
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        Properties prop = new Properties();
        prop.load(is);
        System.out.println(prop);
        is.close();
    }
}
