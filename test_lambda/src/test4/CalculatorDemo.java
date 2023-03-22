package test4;

public class CalculatorDemo {
    public static void main(String[] args) {
        useCalculator(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        /*
        lambda省略格式:
            1.参数类型可以省略,但是有多个参数的情况下,不能只省略一个
            2.如果参数有且仅有一个，那么小括号可以省略
            3.如果代码块的语句只有一条,可以省略大括号和分号,甚至是return
         */
        useCalculator((a, b) ->
                a + b
        );
    }

    public static void useCalculator(Calculator calculator) {
        int result = calculator.calc(12, 23);
        System.out.println(result);
    }
}

interface Calculator {
    abstract int calc(int a, int b);
}