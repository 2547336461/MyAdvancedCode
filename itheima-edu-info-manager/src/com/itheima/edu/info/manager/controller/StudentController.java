package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController extends BaseStudentController{
    private Scanner sc = new Scanner(System.in);
    // 键盘录入学生信息
    @Override
    public Student inputStudentInfo(String stuId) {
        System.out.println("请输入学生姓名");
        String stuName = sc.next();
        System.out.println("请输入学生年龄");
        String stuAge = sc.next();
        System.out.println("请输入学生生日");
        String stuBirthday = sc.next();
        Student stuTemp = new Student();
        stuTemp.setId(stuId);
        stuTemp.setName(stuName);
        stuTemp.setAge(stuAge);
        stuTemp.setBirthday(stuBirthday);
        return stuTemp;
    }
}
