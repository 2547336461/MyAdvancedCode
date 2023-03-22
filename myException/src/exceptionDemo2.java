import java.text.ParseException;

public class exceptionDemo2 {
    public static void main(String[] args) throws ParseException {
      int[] array = {1, 2, 3, 4};
      // ArrayIndexOutOfBoundsException
      System.out.println(array[5]);
      /*
        当代码出现了异常，那么就在这里创建了一个异常对象.
        new ArrayIndexOutOfBoundsException( );
        首先会看,程序中有没有自己处理异常的代码。
        如果没有,交给本方法的调用者处理.
        最终这个异常会交给虚拟机默认处理.
        JVM默认处理异常做了哪几件事情:
        1,将异常信息以红色字体展示在控制台上.
        2,虚拟机停止运行————哪里出现异常，程序就会在哪里停止。
      */
//
//      String str = null;
//      NullPointerException
//      System.out.println(str.equals("嘿嘿"));

//      SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//      ParseException
//      sdf.parse("1999-10月19日");
    }
}
