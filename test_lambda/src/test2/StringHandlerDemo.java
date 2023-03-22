package test2;

public class StringHandlerDemo {
    public static void main(String[] args) {
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String string) {
                System.out.println("我是匿名内部类" + string);
            }
        });
        useStringHandler(string ->
                System.out.println("我是lambda表达式" + string)
        );
    }

    public static void useStringHandler(StringHandler stringHandler) {
        stringHandler.printMessage("myString");
    }
}

// 定义接口
interface StringHandler {
    abstract void printMessage(String string);
}