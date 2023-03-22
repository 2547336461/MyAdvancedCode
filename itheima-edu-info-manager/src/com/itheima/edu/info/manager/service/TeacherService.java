package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.TeacherDao;
import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean AddTeacher(Teacher teacher) {
        return teacherDao.AddTeacher(teacher);
    }

    public boolean isExist(String teacherId) {
        // 1.获取库管对象中的数组
        Teacher[] teachers = teacherDao.findAllTeacher();
        boolean exist = false;
        // 2.遍历数组，取出每一个元素进行判断
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null && teacher.getId().equals(teacherId)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public Teacher[] findAllTeacher() {
        Teacher[] teachers = teacherDao.findAllTeacher();
        boolean flag = false;
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if (t != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return teachers;
        } else {
            return null;
        }
    }

    public void deleteTeacherById(String deleteId) {
        teacherDao.deleteTeacherById(deleteId);
    }

    public void updateTeacher(String updateId, Teacher teacher) {
        teacherDao.updateTeacher(updateId, teacher);
    }
}
