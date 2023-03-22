package charStream1;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        // flush() 刷新流，刷新完之后还可以继续写数据
        // close() 关闭流，释放资源 关闭之后不可以写数据了（关闭之前会自动运行刷新流）
        FileWriter fw = new FileWriter("myCharStream\\a.txt");
        fw.write("张宇涛");
        fw.flush();
        fw.write("666");
        fw.flush();
        fw.close();
    }
}
