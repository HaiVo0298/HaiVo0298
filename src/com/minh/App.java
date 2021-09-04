package com.minh;

import com.minh.service.StudentService;
import com.minh.service.TeacherService;
import com.minh.model.Student;
import com.minh.model.Teacher;

public class App {
    public static void main(String[] args) {
//        Giờ ông xử lý phần nhập từ bàn phím là ok.
//        Hàm tui build hết r.ồi
        StudentService.save(getStudent());
        TeacherService.save(getTeacher());
    }
    public static Student getStudent() {
        return new Student(1, 23, "90 HVN", "Minh", "10A1", 8);
    }

    public static Teacher getTeacher() {
        return new Teacher(1, 23, "90 HVN", "Minh", "Toan");
    }
}
