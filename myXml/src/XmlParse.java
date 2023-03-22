import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlParse {
    //利用dom4j解析xml文件
    public static void main(String[] args) throws DocumentException {
        // 1.获取解析器对象
        SAXReader saxReader = new SAXReader();
        // 2.利用解析器把XML文件加载到内存中，返回文档对象
        Document document = saxReader.read(new File("myXml//src//student.xml"));
        // 3.获取到根标签
        Element rootElement = document.getRootElement();
        // 4.通过根标签获取student标签
        // elements()方法可以获取调用者所有的子标签，会把子标签放到集合中返回。
        // List list = rootElement.elements();
        // elements("标签名")方法可以获取调用者所有的指定标签，并把子标签放进集合中返回
        List<Element> studentElements = rootElement.elements("student");
        // System.out.println(list.size());
        // 5.遍历集合，得到每一个student标签

        // 用来装学生对象
        ArrayList<Student> list = new ArrayList<>();

        for (Element element : studentElements) {
            // element依次表示每一个student标签
            // 获取id这个属性
            Attribute attribute = element.attribute("id");
            // 获取id的属性值
            String id = attribute.getValue();

            // 获取name标签
            // element("标签名")获取调用者指定的标签名
            Element nameElement = element.element("name");
            // 获取这个标签的标签体内容
            String name = nameElement.getText();

            // 获取age标签
            Element ageElement = element.element("age");
            // 获取这个标签的标签体内容
            String age = ageElement.getText();
//            System.out.println(id);
//            System.out.println(name);
//            System.out.println(age);
            Student s = new Student(id, name, Integer.parseInt(age));
            list.add(s);
        }
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
