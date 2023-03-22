package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    private static Teacher[] teacherArray = new Teacher[5];

    public boolean AddTeacher(Teacher teacher) {
        int index = -1;
        for (int i = 0; i < teacherArray.length; i++) {
            Teacher teacherTemp = teacherArray[i];
            if (teacherTemp == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            teacherArray[index] = teacher;
            return true;
        }
    }

    // 查询所有元素
    public Teacher[] findAllTeacher() {
        return teacherArray;
    }

    // 元素用null替换
    public void deleteTeacherById(String deleteId) {
        int index = getIndex(deleteId);
        teacherArray[index] = null;
    }

    // 查询id所在索引位置
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < teacherArray.length; i++) {
            Teacher teacher = teacherArray[i];
            if (teacher != null && teacher.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateTeacher(String updateId, Teacher newTeacher) {
        int index = getIndex(updateId);
        teacherArray[index] = newTeacher;
    }
}



