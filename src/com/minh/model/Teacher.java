package com.minh.model;

public class Teacher extends Person {
    private String department;

    public Teacher() {
    }

    public Teacher(Integer id, int age, String address, String name, String department) {
        super(id, age, address, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
