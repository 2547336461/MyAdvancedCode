package test4;

public class testInterface {
    public static void main(String[] args) {
        // 接口中的静态方法只能通过接口名.的方法调用
        InterA.show();
        InterB.show();
    }
}

class InterAImpl implements InterA, InterB {

}
