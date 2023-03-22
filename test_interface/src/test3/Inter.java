package test3;

public interface Inter {
    public default void show() {
        System.out.println("我是接口1中的方法");
    }
}
