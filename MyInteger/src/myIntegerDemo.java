public class myIntegerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1);
        System.out.println(i2);

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        System.out.println(i3);
        System.out.println(i4);
    }
}
