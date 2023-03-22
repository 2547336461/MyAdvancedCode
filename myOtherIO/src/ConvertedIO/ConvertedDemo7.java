package ConvertedIO;

import java.io.*;
import java.util.ArrayList;

public class ConvertedDemo7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student st1 = new Student("肚子疼", 16);
        Student st2 = new Student("张三", 17);
        Student st3 = new Student("李四", 12);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myOtherIO\\a.txt"));
        // 创建集合用于储存
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        // 直接将整个集合写入
        oos.writeObject(arrayList);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherIO\\a.txt"));
        ArrayList<Student> list2 = (ArrayList<Student>) ois.readObject();
        for (Student student : list2) {
            System.out.println(student);
        }
        ois.close();
    }
}
