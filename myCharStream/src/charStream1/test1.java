package charStream1;

import java.io.*;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) throws IOException {
        //需求:读取文件中的数据，排序后再次写到本地文件
        //分析:
        //1.要把文件中的数据读取进来
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\sort.txt"));
        String str = br.readLine();
        System.out.println("读取到的数据为：" + str);
        br.close();
        // 按照空格进行切割
        String[] splitArray = str.split(" ");
        int[] arrayList = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            // 遍历，转换，传入arrayList
            arrayList[i] = Integer.parseInt(splitArray[i]);
        }
        //2.排序
        Arrays.sort(arrayList);
        System.out.println(Arrays.toString(arrayList));
        //3.把排序之后结果写回到本地1 2 3 4...
        // 输出流一定不要写在上面 否则会清空数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\sort.txt"));
        for (int i = 0; i < arrayList.length; i++) {
            // 必须要加一个分隔符，否则出错
            bw.write(arrayList[i]+" ");
            bw.flush();
        }
        bw.close();
    }
}
