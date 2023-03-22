package FileTest;

import java.io.File;
import java.util.HashMap;

public class Test3 {
    //统计一个文件夹中，每种文件出现的次数.
    //统计---定义一个变量用来统计. ----弊端:同时只能统计一种文件
    //利用map集合进行数据统计 (键---文件后缀名 值---次数)
    public static void main(String[] args) {
        File file = new File("D:\\study\\java");
        HashMap<String, Integer> hm = new HashMap<>();
        getCount(hm, file);
        System.out.println(hm);
    }

    // 利用循环嵌套的方法统计
    private static void getCount(HashMap<String, Integer> hm, File file) {
        // 利用listFile方法获得file路径下files列表
        File[] files = file.listFiles();
        // 循环遍历files列表中所有的file
        for (File f : files) {
            // 判断f是否是文件
            if (f.isFile()) {
                // 如果是文件获取该文件的文件名
                String fileName = f.getName();
                // 通过split方法用\.切割获取 由文件名和文件后缀组成的列表
                String[] splitName = fileName.split("\\.");
                // 排除文件有多个.或者没有.的情况
                if (splitName.length == 2) {
                    // 创建变量fileEndName储存后缀名
                    String fileEndName = splitName[1];
                    // 判断在HashMap中是否存在该后缀名
                    if (hm.containsKey(fileEndName)) {
                        // r如果存在 就取出key 并自增一 再存进去
                        Integer count = hm.get(fileEndName);
                        count++;
                        hm.put(fileEndName, count);
                    } else {
                        // key中不存在就直接用put创建键值对
                        hm.put(fileEndName, 1);
                    }
                }
            } else {
                // 如果是嵌套的文件夹就嵌套调用getCount方法
                getCount(hm, f);
            }
        }
    }
}
