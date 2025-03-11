package com.mentoring.level2.streamHW.statistic;

import com.mentoring.level2.streamHW.student.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticMap {

    private int course;
    private double avgCourseAssessment;
    private List<String> fullName;
    private List<Person> studentsNameAndAvgAssessment;

    public StatisticMap(int course, List<Student> studentList) {
        this.course = course;
        avgCourseAssessment = setAvgCourseAssessment(studentList);
        fullName = setFullName(studentList);
        studentsNameAndAvgAssessment = setStudentsNameAndAvgAssessment(studentList);
    }


    public double setAvgCourseAssessment(List<Student> studentList) {
        return avgCourseAssessment = studentList.stream()
                .filter(it -> it.getCourseNumber() == course)
                .filter(it -> it.getAssessmentList().size() > 3)
                .mapToDouble(Student::getAvgAssessmentList)
                .average()
                .getAsDouble();
    }

    public List<String> setFullName(List<Student> studentList) {
        return studentList.stream()
                .filter(it -> it.getCourseNumber() == course)
                .map(Student::getFullName)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    public List<Person> setStudentsNameAndAvgAssessment(List<Student> studentList) {

        List<Person> people = new LinkedList<>();
        studentList.stream()
                .filter(it -> it.getCourseNumber() == course)
                .sorted((strin1, string2) -> strin1.getFullName().compareTo(string2.getFullName()))
                .forEach(it -> {
                    people.add(new Person(it.getFullName(), it.getAvgAssessmentList()));
                });
        return people;
//                .peek(it -> {
//                    new Person(it.getFullName(), it.getAvgAssessmentList());
//                })
//                .collect(Collectors.toList());
//                .forEach(it -> {
//                    new Person(it.getFullName(), it.getAvgAssessmentList());
//                });

    }

    @Override
    public String toString() {
        return "Статистика курса: №" + course +
                ", средняя оценка на курсе:" + avgCourseAssessment +
                ", полные имена студентов:" + fullName +
                "\nПодробная статистика студентов:" + studentsNameAndAvgAssessment;
    }
}
