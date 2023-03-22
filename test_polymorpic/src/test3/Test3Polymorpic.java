package test3;

public class Test3Polymorpic {
    public static void main(String[] args) {
        /*
            多态的好处：
                定义方法的时候，使用父类作为参数，该方法就可以直接接收这父类的任意子类对象
         */
        useAnimal(new Dog());
        useAnimal(new Cat());
    }

    public static void useAnimal(Animal a) {
        a.eat();
        // 多态的弊端：不能调用子类特有的成员内容
        // a.WatchHome  报错
    }
}


abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void WatchHome() {
        System.out.println("看家ing...");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}