package StreamDemo1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MyStream5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张涛" );
        list.add("张无忌" );
        list.add("张翠山" );
        list.add("王二麻子" );
        list.add("张良" );
        list.add("谢广坤" );

        // method1(list);
        long count = list.stream().count();
        System.out.println(count);
    }

    private static void method1(ArrayList<String> list) {
        //在forEach方法的底层,会循环获取到流中的每一个数据.
        //并循环调用accept方法,并把每一个数据传递给accept方法
        //s就依次表示了流中的每一个数据，
        //所以，我们只要在accept方法中，写上处理的业务逻辑就可以了.
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
        // lambda表达式
        list.stream().forEach(
                (String s) -> {
                    System.out.println(s);
                }
        );
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=");
        // lambda表达式简写
        list.stream().forEach(s-> System.out.println(s));
    }
}
