package test6;

public class testInterface {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();
        // 如果直接父亲和接口出现了同名方法声明，但是代码逻辑不一样，
        // 优先使用直接父亲的代码逻辑
    }
}

class InterImpl extends Fu implements Inter {

}