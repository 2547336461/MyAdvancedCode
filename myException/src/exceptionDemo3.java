import java.text.ParseException;
import java.text.SimpleDateFormat;

public class exceptionDemo3 {
    public static void main(String[] args) throws ParseException {
        method1();

        method2();
    }

    //告诉调用者,你调用我,有可能会出现这样的异常哦.
    //如果方法中没有出现异常,那么正常执行
    //如果方法中真的出现了异常,其实也是将这个异常交给了调用者处理
    //如果声明的异常是一个[编译时异常],那么声明的代码必须要手动写出 (exception)

    public static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //ParseException
        sdf.parse("1999-10月19日");
    }

    //告诉调用者，你调用我,有可能会出现这样的异常哦.
    //如果方法中没有出现异常，那么正常执行
    //如果方法中真的出现了异常,其实也是将这个异常交给了调用者处理.
    //如果声明的异常是一个[运行时异常]，那么声明的代码可以省略 (RuntimeException)
    public static void method1() throws NullPointerException{
        String str = null;
        //NullPointerException
        System.out.println(str.equals("嘿嘿"));
    }
}
