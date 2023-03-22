package threadDemo15;

public class Demo {
    public static void main(String[] args) {
        Desk desk = new Desk();

        Foodie f = new Foodie(desk);
        Cook c = new Cook(desk);
        f.start();
        c.start();
    }


}
