package com.minh.mapper;

import com.minh.model.Teacher;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherMapper implements RowMapper<Teacher> {
    @Override
    public Teacher mapRow(final ResultSet resultSet) {
        try {
            Teacher teacher =  new Teacher();
            teacher.setId(resultSet.getInt("id"));
            teacher.setAge(resultSet.getInt("age"));
            teacher.setAddress(resultSet.getString("address"));
            teacher.setName(resultSet.getString("name"));
            teacher.setDepartment(resultSet.getString("department"));
            return teacher;
        } catch (SQLException e) {
            return null;
        }
    }
}
