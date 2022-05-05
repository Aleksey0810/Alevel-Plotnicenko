package com.plotnichenko.hw16;

import lombok.Getter;
@Getter
public class Student {
    private final String name;
    private final String group;
    private int course;
    public final int grades;


    public Student(String name, String group, int course, int grades) {
        if (course < 1 || course > 6 || grades < 1 || grades > 5) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public void nextCourse() {
        if (course < 6) {
            course++;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}
