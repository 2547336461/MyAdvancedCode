package mapDemo1.test2;

import java.util.Objects;

// 实现Comparable接口时一定要指定泛型
public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 方法一自然排序
    @Override
    public int compareTo(Student o) {
        // 按照年龄排序
        int result = this.getAge() - o.getAge();
        // 次要条件按照id排序
        result = result == 0 ? this.getId().compareTo(o.getId()) : result;
        return result;
    }
}
