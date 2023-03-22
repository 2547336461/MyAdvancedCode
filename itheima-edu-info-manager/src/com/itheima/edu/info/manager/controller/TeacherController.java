package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Teacher;
import com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();

    public void start() {
        TeacherLoop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    // System.out.println("添加老师");
                    AddTeacher();
                    break;
                case "2":
                    // System.out.println("删除老师");
                    deleteTeacherById();
                    break;
                case "3":
                    // System.out.println("修改老师");
                    updateTeacher();
                    break;
                case "4":
                    // System.out.println("查看老师");
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("退出");
                    break TeacherLoop;
                default:
                    System.out.println("输入有误请重新输入");
                    break;
            }
        }
    }

    // 更新老师
    public void updateTeacher() {
        // 调用方法输入老师id
        String updateId = inputTeacherId();
        // 调用方法录入老师信息
        Teacher teacher = inputTeacherInfo(updateId);
        teacherService.updateTeacher(updateId, teacher);
        System.out.println("修改成功！");
    }

    // 删除老师
    public void deleteTeacherById() {
        String deleteId = inputTeacherId();
        teacherService.deleteTeacherById(deleteId);
        System.out.println("删除成功！");
    }

    // 查看老师
    public void findAllTeacher() {
        Teacher[] teachers = teacherService.findAllTeacher();
        if (teachers == null) {
            System.out.println("查无信息");
            return;
        }
        System.out.println("id\t" + "姓名\t" + "年龄\t" + "生日");
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null)
                System.out.println(teacher.getId() + "\t" + teacher.getName() + "\t" + teacher.getAge() + "\t" + teacher.getBirthday());
        }
    }

    // 添加老师
    public void AddTeacher() {
        String TeacherId;
        while (true) {
            System.out.println("请输入老师id");
            TeacherId = sc.next();
            boolean exist = teacherService.isExist(TeacherId);
            if (exist) {
                System.out.println("id已被占用,请重新输入：");
            } else {
                break;
            }
        }
        Teacher teacher = inputTeacherInfo(TeacherId);
        boolean result = teacherService.AddTeacher(teacher);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    // 录入老师id
    public String inputTeacherId() {
        String Id;
        while (true) {
            System.out.println("请输入老师id");
            Id = sc.next();
            boolean exist = teacherService.isExist(Id);
            if (!exist) {
                System.out.println("输入id不存在请重新输入：");
            } else {
                break;
            }
        }
        return Id;
    }

    // 录入老师信息并封装为对象
    public Teacher inputTeacherInfo(String TeacherId) {
        System.out.println("请输入老师姓名");
        String TeacherName = sc.next();
        System.out.println("请输入老师年龄");
        String TeacherAge = sc.next();
        System.out.println("请输入老师生日");
        String TeacherBirthday = sc.next();
        Teacher teacher = new Teacher();
        teacher.setId(TeacherId);
        teacher.setName(TeacherName);
        teacher.setAge(TeacherAge);
        teacher.setBirthday(TeacherBirthday);
        return teacher;
    }
}
