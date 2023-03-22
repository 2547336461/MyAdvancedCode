package test6;

public class TestSwimming {
    public static void main(String[] args) {

        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("去游泳");
            }
        });
    }

    // 使用接口方法
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}


//游泳接口
interface Swimming {
    void swim();
}
