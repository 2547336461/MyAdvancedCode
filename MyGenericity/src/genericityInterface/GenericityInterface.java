package genericityInterface;

public class GenericityInterface {
    public static void main(String[] args) {
        // 实现类的对象（延续泛型）
        GenericityImpl1<String> Genercity = new GenericityImpl1<>();
        Genercity.method("你好");

        // // 实现类的对象（类型已经确定）
        GenercityImple2 Genercity2 = new GenercityImple2();
        Genercity2.method(12);
    }
}

// 定义接口
interface Genericity<E>{
    public abstract void method(E e);
}

// 接口的实现类(确定参数类型)
class GenercityImple2 implements Genericity<Integer>{
    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}

// 接口的实现类(不确定参数类型)
class GenericityImpl1<E> implements Genericity<E>{
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}