package myReflect4;

public class Student {
    private int money = 300;
    public String name;
    public int age;
    public String gender;

    @Override
    public String toString() {
        return "Student{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
