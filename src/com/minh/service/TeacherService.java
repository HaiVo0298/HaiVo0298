package com.minh.service;

import com.minh.mapper.TeacherMapper;
import com.minh.model.Teacher;
import com.minh.utils.SqlUtils;
import java.util.List;

public class TeacherService {
    public static Integer save(final Teacher teacher) {
        final StringBuilder sql = new StringBuilder("INSERT INTO teacher ");
        sql.append("(age, address, name, department)");
        sql.append("VALUES (?, ?, ?, ?)");
        return SqlUtils.insert(sql.toString(), teacher.getAge(), teacher.getAddress(),
                teacher.getName(), teacher.getDepartment());

    }

    public static void update(final Teacher teacher) {
        final StringBuilder sql = new StringBuilder("UPDATE teacher SET age = ?, ");
        sql.append(" address = ?, name = ?, department = ? ");
        sql.append(" WHERE id = ? ");
        SqlUtils.update(sql.toString(), teacher.getAge(), teacher.getAddress(),
                teacher.getName(), teacher.getDepartment(), teacher.getId());

    }

    public void delete(final Integer id) {
        final String sql = "DELETE FROM teacher WHERE id = ?";
        SqlUtils.update(sql, id);
    }

    public Teacher findOne(final Integer id) {
        String sql = "SELECT * FROM teacher WHERE id = ?";
        List<Teacher> teachers = SqlUtils.query(sql, new TeacherMapper(), id);
        return teachers.isEmpty() ? null : teachers.get(0);
    }
}
