package Catch;

public class Student {
    private String name;
    private int age;

    public Student() {
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
        if (age <= 24 && age >= 18) {
            this.age = age;
        } else {
            // throw new RuntimeException("年龄超出范围了");
            // 自定义异常可以更加见名知意
            throw new AgeOutOfBoundsException("年龄超出范围了");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
