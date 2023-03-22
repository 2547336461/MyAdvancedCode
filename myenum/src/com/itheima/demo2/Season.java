package com.itheima.demo2;

public enum Season {
    // 有参构造
    SPRING("春") {
        // 如果枚举类中有抽象方法
        // 枚举项中必须要全部重写
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },
    SUMMER("夏") {
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },
    AUTUMN("秋") {
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },
    WINTER("冬") {
        @Override
        public void show() {
            System.out.println(this.name);
        }
    };
    // 4.枚举也是一个类，也可以去定义成员变量
    public String name;
    // 5.枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的，
    // 但是如果枚举类有其他的东西，这个分号就不能省略。建议不要省略

    // 6.枚举类可以有构造器，但必须是private的， 它默认的也是private的。
    // 枚举项的用法比较特殊: 枚举("");
    //Season(){};
    Season(String name) {
    }

    ;

    // 7.枚举类也可以有抽象方法，但是枚举项必须重写该方法
    // 定义抽象方法
    public abstract void show();
}
