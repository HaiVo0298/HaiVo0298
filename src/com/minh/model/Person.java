package com.minh.model;

public abstract class Person {
    protected Integer id;
    protected int age;
    protected String address;
    protected String name;

    public Person() {
    }

    public Person(Integer id, int age, String address, String name) {
        this.id = id;
        this.age = age;
        this.address = address;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
