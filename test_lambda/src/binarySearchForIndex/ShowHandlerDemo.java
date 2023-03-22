package binarySearchForIndex;

public class ShowHandlerDemo {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类中的show方法");
            }
        });
        /*
        lambda实现方式
        使用Lambda的条件：
            1.有一个接口
            2.接口中只有一个抽象方法
        */
        useShowHandler(() -> System.out.println("我是lambda中的show方法"));
    }
// 编写方法 方法中参数为接口类型
    public static void useShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }
}

// 一个接口
interface ShowHandler {
    // 接口中只有一个抽象方法
    public abstract void show();
}