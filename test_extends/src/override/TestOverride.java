package override;

public class TestOverride {
    public static void main(String[] args) {
        /*
        方法重写的应用场景:
            当子类需要父类的功能，而功能主体拥有自己的特有功能
            可以重写父亲中的方法，这样即沿袭了父类的功能，又定义了子类特有的内容
        注意方法重载和方法重写的区别：
             方法重写：在继承体系中子类出现了和父类一模一样的方法声明（方法名，参数列表，返回值类型）
             方法重载：在同一个方法中，方法名相同，参数列表不同，与返回值无关
         */


        iPearV2 i = new iPearV2();
        i.smallBlack();
    }
}
