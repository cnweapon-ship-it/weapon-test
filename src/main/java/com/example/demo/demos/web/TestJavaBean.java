package com.example.demo.demos.web;

public class TestJavaBean {
    public static void main(String[] args) {
        Teacher t=new Teacher()
    }
}

class Teacher {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Teacher(String name) {}
}

