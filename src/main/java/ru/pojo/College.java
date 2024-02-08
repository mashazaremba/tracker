package ru.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Maria", "27", LocalDate.now());
        student.setName("Maria");
        student.setGroup("27");
        student.setDate(LocalDate.now());
        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getDate());
    }
}
