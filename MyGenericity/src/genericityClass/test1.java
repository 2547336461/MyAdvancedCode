package genericityClass;

public class test1 {
    public static void main(String[] args) {
        box<String> box1 = new box<>();
        box1.setElement("susan");
        System.out.println(box1.getElement());

        box<Integer> box2 = new box<>();
        box2.setElement(12);
        System.out.println(box2.getElement());
    }
}
