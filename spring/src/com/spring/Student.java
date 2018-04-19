package com.spring;

import java.io.Serializable;
import java.util.Map;

/**
 * @author jky
 * @date 2018/4/19 11:30
 */
public class Student implements Serializable{

    private static final long serialVersionUID = -8406769452965378230L;
    private String name;
    private int age;
    private Teacher teacher;
    private Map<String,Object> map;

    public Student() {
    }

    public Student(String name, int age) {
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                ", map=" + map +
                '}';
    }
}
