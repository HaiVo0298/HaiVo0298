package com.minh.model;

public class Student extends Person {
    private String className;
    private float gpa;
    public Student() {
    }

    public Student(Integer id, int age, String address, String name, String className, float gpa) {
        super(id, age, address, name);
        this.className = className;
        this.gpa = gpa;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
