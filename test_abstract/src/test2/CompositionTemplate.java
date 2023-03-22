package test2;

public abstract class CompositionTemplate {
    public void write() {
        System.out.println("《作文题目》");
        body();
        System.out.println("作文结尾。");
    }

    public abstract void body();
}
