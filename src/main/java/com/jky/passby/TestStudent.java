package com.jky.passby;


/**
 * @author jky
 * @date 2018/3/13 10:01
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1,"张三");
        change(student);
        System.out.println(student);
        String str = "shenzhen";
        changeStr(str);
        System.out.println(str);
    }

    public static void change(Student student){
        student.setAge(6);
        student.setName("李四");
    }

    public static void changeStr(String str){
        str = "beijing";
    }
}
