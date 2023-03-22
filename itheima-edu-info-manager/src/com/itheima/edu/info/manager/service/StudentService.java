package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.BaseStudentDao;
import com.itheima.edu.info.manager.dao.OtherStudentDao;
import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.factory.StudentDaoFactory;

public class StudentService {

    // 创建StudentDao(库管)
    //private OtherStudentDao studentDao = new OtherStudentDao();

    // 通过学生库管工厂类，获取库管对象
    private BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();
    // 添加学生
    public boolean addStudent(Student stuTemp) {
        boolean result = studentDao.addStudent(stuTemp);
        return result;
    }

    // 判断是否存在
    public boolean isExists(String stuId) {
        Student[] stuArray = studentDao.findAllStudent();
        // 假设id在数组中不存在
        boolean isExists = false;
        // 遍历数组，获取每一个学生对象，准备判断
        for (int i = 0; i < stuArray.length; i++) {
            Student student = stuArray[i];
            if (student != null && student.getId().equals(stuId)) {
                isExists = true;
                break;
            }
        }
        return isExists;
    }

    // 遍历学生
    public Student[] findAllStudent() {
        Student[] allStudent = studentDao.findAllStudent();
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if (stu != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return allStudent;
        } else {
            return null;
        }
    }

    // 删除学生
    public void deleteStudentById(String delId) {
        studentDao.deleteStudentById(delId);
    }

    // 更新学生
    public void updateStudent(String updateId, Student newStu) {
        studentDao.updateStudent(updateId,newStu);
    }
}




