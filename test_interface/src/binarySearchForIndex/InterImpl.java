package binarySearchForIndex;

// InterImpl实现类可以同时实现多个接口 （与继承不同）
public class InterImpl implements Inter, Inter2 {
    @Override
    public void study() {
        System.out.println("我是实现类中的study方法");
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
