package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao{
    private static ArrayList<Student> stuArray = new ArrayList<>();

    static {
        Student stu1 = new Student("heima001", "张三", "23", "1999-01-02");
        Student stu2 = new Student("heima002", "李四", "24", "1998-11-07");
        Student stu3 = new Student("heima003", "王二", "25", "2000-05-03");
        stuArray.add(stu1);
        stuArray.add(stu2);
        stuArray.add(stu3);
    }

    // 添加学生元素
    public boolean addStudent(Student stuTemp) {
        stuArray.add(stuTemp);
        return true;
    }

    // 查找全部学生
    public Student[] findAllStudent() {
        Student[] students = new Student[stuArray.size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = stuArray.get(i);
        }
        return students;
    }

    // 删除学生方法
    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        stuArray.remove(index);
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stuArray.size(); i++) {
            Student student = stuArray.get(i);
            if (student != null && student.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String updateId, Student newStu) {
        int index = getIndex(updateId);
        stuArray.set(index, newStu);
    }
}
