package threadDemo3;

import java.util.concurrent.Callable;

public class myCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("跟女生表白"+i);
        }
        // 返回值表示线程结束之后的结果
        return "同意";

    }
}
