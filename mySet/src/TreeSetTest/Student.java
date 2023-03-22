package TreeSetTest;

public class Student implements Comparable<Student> {
    private String name;
    private int Chinese;
    private int Math;
    private int English;

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getSum() {
        return Math + Chinese + English;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                '}' + "总分为：" + getSum();
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getSum() - o.getSum();
        result = result == 0 ? this.Chinese - o.Chinese : result;
        result = result == 0 ? this.Math - o.Math : result;
        result = result == 0 ? this.English - o.English : result;
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return result;
    }
}
