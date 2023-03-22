package threadDemo4;

public class AtomDemo {
    public static void main(String[] args) {
        MyAtomThread mat = new MyAtomThread();

        for (int i = 0; i < 100; i++) {
            new Thread(mat).start();
        }
    }
}
