package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao implements BaseStudentDao{
    private static Student[] stuArray = new Student[5];
    static {
        Student stu1 = new Student("heima001","张三","23","1999-01-02");
        Student stu2 = new Student("heima002","李四","24","1998-11-07");
        Student stu3 = new Student("heima003","王二","25","2000-05-03");
        stuArray[0] = stu1;
        stuArray[1] = stu2;
        stuArray[2] = stu3;
    }

    public boolean addStudent(Student stuTemp) {
        // 定义变量index为-1，假设数组已经全部存满，没有null的元素
        int index = -1;
        // 遍历数组取出每一个元素，判断是否是null
        for (int i = 0; i < stuArray.length; i++) {
            Student student = stuArray[i];
            if (student == null) {
                index = i;

                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            stuArray[index] = stuTemp;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return stuArray;
    }

    public void deleteStudentById(String delId) {
        // 查找id在容器中的索引位置
        int index = getIndex(delId);
        // 将索引位置元素用null替换
        stuArray[index] = null;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stuArray.length; i++) {
            Student student = stuArray[i];
            if (student != null && student.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String updateId, Student newStu) {
        int index = getIndex(updateId);
        stuArray[index] = newStu;
    }
}
