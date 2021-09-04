package com.minh.mapper;

import com.minh.model.Student;
import com.minh.model.Teacher;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(final ResultSet resultSet) {
        try {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setAge(resultSet.getInt("age"));
            student.setAddress(resultSet.getString("address"));
            student.setName(resultSet.getString("name"));
            student.setClassName(resultSet.getString("class_name"));
            student.setGpa(resultSet.getFloat("gpa"));
            return student;
        } catch (SQLException e) {
            return null;
        }
    }
}
