package com.mentoring.level2.streamHW.newList;

import com.mentoring.level2.streamHW.student.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStudentMap {

    private int course;
    private double avgCourseAssessment;
    private List<String> fullName;
    private List<Person> studentsNameAndAvgAssessment;

    public NewStudentMap(int course, List<Student> studentList) {
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

        List<Person> people = new ArrayList<>();
        return studentList.stream()
                .filter(it -> it.getCourseNumber() == course)
//                .flatMap(it -> it.getAssessmentList().stream())
                .
//                .peek(it -> {
//                    new Person(it.getFullName(), it.getAvgAssessmentList());
//                })
//                .collect(Collectors.toList());
//                .collect(Collectors.toList());
//                .forEach(it -> {
//                    new Person(it.getFullName(), it.getAvgAssessmentList());
//                });

    }
}
