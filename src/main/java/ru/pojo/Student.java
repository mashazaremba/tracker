package ru.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private String group;
    private LocalDate date;

    public Student() {
    }

    public Student(String name, String group, LocalDate date) {
        this.name = name;
        this.group = group;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
