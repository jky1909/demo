package com.spring;

import java.io.Serializable;
import java.util.List;

/**
 * @author jky
 * @date 2018/4/19 14:09
 */
public class Teacher implements Serializable{
    private static final long serialVersionUID = -7976049633641207021L;
    private String name;
    private int age;
    private List<Student> students;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
