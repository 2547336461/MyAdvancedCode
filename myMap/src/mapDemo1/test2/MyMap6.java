package mapDemo1.test2;

import java.util.Comparator;
import java.util.TreeMap;

public class MyMap6 {
    public static void main(String[] args) {
        // 方法二比较器排序
        // 注意：自然排序和比较器排序同时存在，优先比较器排序
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o2, Student o1) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        Student st1 = new Student("001", "laoWang", 19);
        Student st2 = new Student("002", "Tom", 14);
        Student st3 = new Student("003", "lisa", 19);
        Student st4 = new Student("004", "laoZhang", 12);

        tm.put(st1, "安徽");
        tm.put(st2, "浙江");
        tm.put(st3, "湖北");
        tm.put(st4, "上海");
        // lambda表达式通过传递键值对遍历
        tm.forEach(
                (Student key, String value) -> {
                    System.out.println(key + "-----" + value);
                }
        );
    }
}
