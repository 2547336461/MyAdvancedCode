package threadDemo14;

public class Demo {
    public static void main(String[] args) {
        Foodie f = new Foodie();
        Cook c = new Cook();
        f.start();
        c.start();
    }


}
