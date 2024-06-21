package com.prototype;

public class Student implements Prototype<Student>{
    private int age;
    private int rollNumber;
    private String name;

    public Student(int age, int rollNumber, String name){
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }
    @Override
    public Student clone() {
        return new Student(age, rollNumber, name);
    }
}
