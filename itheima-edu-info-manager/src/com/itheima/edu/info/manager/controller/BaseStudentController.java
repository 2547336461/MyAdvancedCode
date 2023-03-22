package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);

    public final void start() {
        // 开始学生管理系统，展示菜单
        studentLoop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    // System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    // System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3":
                    // System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4":
                    // System.out.println("查看学生");
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢使用");
                    break studentLoop;
                default:
                    System.out.println("输入有误，请重新输入。");
                    break;
            }
        }
    }

    // 更新学生
    public final void updateStudent() {
        String updateId = inputStudentId();
        Student newStu = inputStudentInfo(updateId);

        studentService.updateStudent(updateId, newStu);
        System.out.println("修改成功！");
    }

    // 删除学生
    public final void deleteStudentById() {


        String delId = inputStudentId();
        studentService.deleteStudentById(delId);
        System.out.println("删除成功！");
    }

    // 遍历学生
    public final void findAllStudent() {
        // 调用业务员中的获取方法，得到学生的对象数据
        Student[] stus = studentService.findAllStudent();
        // 判断数组的地址是否为null
        if (stus == null) {
            System.out.println("查无信息");
            return;
        } else {
            // 遍历数组获取信息打印在控制台
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t生日");
            for (int i = 0; i < stus.length; i++) {
                Student stu = stus[i];
                if (stu != null) {
                    System.out.println(stu.getId() + "\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getBirthday());
                }
            }
        }
    }

    // 添加学生
    public final void addStudent() {
        String stuId;
        while (true) {
            System.out.println("请输入学生id");
            stuId = sc.next();
            boolean result = studentService.isExists(stuId);
            if (result) {
                System.out.println("该学生id已存在...");
            } else {
                break;
            }
        }
        Student stuTemp = inputStudentInfo(stuId);

        boolean result = studentService.addStudent(stuTemp);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    // 键盘录入学生id
    public String inputStudentId() {
        String id;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean exists = studentService.isExists(id);
            if (!exists) {
                System.out.println("您输入的id不存在，请重新输入：");
            } else {
                break;
            }
        }
        return id;
    }

    // 键盘录入学生信息
    public abstract Student inputStudentInfo(String stuId);
}
