package com.minh.service;

import com.minh.mapper.StudentMapper;
import com.minh.model.Student;
import com.minh.utils.SqlUtils;
import java.util.List;

public class StudentService {
    public static Integer save(final Student student) {
        final StringBuilder sql = new StringBuilder("INSERT INTO student ");
        sql.append("(age, address, name, class_name, gpa) ");
        sql.append("VALUES (?, ?, ?, ?, ?)");
        return SqlUtils.insert(sql.toString(), student.getAge(), student.getAddress(),
                student.getName(), student.getClassName(), student.getGpa());
    }

    public static void update(final Student student) {
        final StringBuilder sql = new StringBuilder("UPDATE student SET age = ?, ");
        sql.append(" address = ?, name = ?, class_name = ?, gpa = ? ");
        sql.append(" WHERE id = ? ");
        SqlUtils.update(sql.toString(), student.getAge(), student.getAddress(),
                student.getName(), student.getClassName(), student.getGpa(), student.getId());
    }

    public void delete(final Integer id) {
        final String sql = "DELETE FROM student WHERE id = ?";
        SqlUtils.update(sql, id);
    }

    public Student findOne(final Integer id) {
        String sql = "SELECT * FROM student WHERE id = ?";
        List<Student> students = SqlUtils.query(sql, new StudentMapper(), id);
        return students.isEmpty() ? null : students.get(0);
    }

}
