package test3;

import java.util.Random;

public class RandomNumHandlerDemo {
    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNum() {
                Random r = new Random();
                int num = r.nextInt(10) + 1;
                return num;
            }
        });

        useRandomNumHandler(() -> {
            Random r = new Random();
            int num = r.nextInt(10) + 1;
            return num;
        });
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int result = randomNumHandler.getNum();
        System.out.println(result);
    }
}

interface RandomNumHandler {
    abstract int getNum();
}
