package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{
    Scanner sc = new Scanner(System.in);
    // 键盘录入学生信息
    // 开闭原则：对扩展内容开放，对修改内容关闭
    @Override
    public Student inputStudentInfo(String stuId) {
        System.out.println("请输入学生姓名");
        String stuName = sc.next();
        System.out.println("请输入学生年龄");
        String stuAge = sc.next();
        System.out.println("请输入学生生日");
        String stuBirthday = sc.next();
        Student stuTemp = new Student(stuId,stuName,stuAge,stuBirthday);
        return stuTemp;
    }
}
