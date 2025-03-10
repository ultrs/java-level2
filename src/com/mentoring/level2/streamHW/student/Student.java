package com.mentoring.level2.streamHW.student;
/*
Дан список студентов с полями:
- Имя
- Фамилия
- Номер курса в университете
- Список оценок за учебу
 */

import java.util.List;

public class Student {

    private String name;
    private String surname;
    private int courseNumber;
    private List<Assessment> assessmentList;

    public Student(String name, String surname, int courseNumber, List<Assessment> assessmentList) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.assessmentList = assessmentList;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public double getAvgAssessmentList() {
        return assessmentList.stream()
                .mapToInt(Assessment::getAssessment)
                .average()
                .getAsDouble();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public List<Assessment> getAssessmentList() {
        return assessmentList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courseNumber=" + courseNumber +
                ", assessmentList=" + assessmentList +
                '}';
    }
}
