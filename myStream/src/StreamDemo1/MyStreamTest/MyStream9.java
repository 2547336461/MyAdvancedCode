package StreamDemo1.MyStreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream9 {
    /*
    现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
    1.男演员只要名字为3个字的前两人
    2.女演员只要姓杨的，并且不要第一个
    3.把过滤后的男演员姓名和女演员姓名合并到一起
    4.把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
    演员类Actor,里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
     */
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("张国立" );
        manList.add("张晋" );
        manList.add("刘烨" );
        manList.add("郑伊健" );
        manList.add("徐峥" );
        manList.add("王宝强" );
        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("郑爽" );
        womanList.add("杨紫" );
        womanList.add("关晓彤" );
        womanList.add("张天爱" );
        womanList.add("杨幂" );
        womanList.add("赵丽颖" );
        Stream<String> list1 = manList.stream().filter(s -> s.length() == 3).limit(2);
        Stream<String> list2 = womanList.stream().filter(s -> s.startsWith("杨" )).skip(1);
        Stream.concat(list1, list2).forEach(name -> {
            Actor actor = new Actor(name);
            System.out.println(actor);
        });
    }
}

