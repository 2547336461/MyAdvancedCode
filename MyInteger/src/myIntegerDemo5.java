public class myIntegerDemo5 {
    //需求:有一个字符串:“91 27 46 38 50”，把其中的每一个数存到int类型的数组中
    public static void main(String[] args) {
        String s1 = "91 27 46 38 50";
        String[] strArray = s1.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            int i2 = Integer.parseInt(strArray[i]);
            intArray[i] = i2;
            System.out.println(intArray[i]);
        }
    }
}
