package myClassLoader;

public class ClassLoaderDemo01 {
    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // 获取系统类加载器父类---平台类加载器
        ClassLoader classLoader1 = systemClassLoader.getParent();
        // 获取平台类加载器父类---启动类加载器
        ClassLoader classLoader2 = classLoader1.getParent();

        System.out.println(systemClassLoader);
        System.out.println(classLoader1);
        System.out.println(classLoader2);
    }
}
