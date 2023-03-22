package ConvertedIO;

import java.io.*;

public class ConvertedDemo6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student st1 = new Student("肚子疼", 16);
        Student st2 = new Student("张三", 17);
        Student st3 = new Student("李四", 12);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myOtherIO\\a.txt"));
        oos.writeObject(st1);
        oos.writeObject(st2);
        oos.writeObject(st3);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherIO\\a.txt"));
        Object object;
        /*
        while ((object = ois.readObject()) != null) {
            System.out.println(object);
        }
        */
        while (true) {
            try {
                Object o = ois.readObject();
                System.out.println(o);
            } catch (EOFException e) {
                break;
            }
        }
        ois.close();
    }
}
