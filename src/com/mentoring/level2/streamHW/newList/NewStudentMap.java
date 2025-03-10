package com.mentoring.level2.streamHW.newList;

import com.mentoring.level2.streamHW.student.Assessment;
import com.mentoring.level2.streamHW.student.Student;

import java.util.List;

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
        avgCourseAssessment = studentList.stream()
                .filter(it -> it.getCourseNumber() == course)
                .filter(it -> it.getAssessmentList().size() > 3)
                .map(Student::getAssessmentList)
//                .map(Assessment::getAssessment)
//                .mapToInt(Integer::valueOf)
                .mapToInt(Assessment::getAssessment)
    }

    public void setFullName(List<String> studentList) {
//        fullName = studentList.stream()
//                .filter()
//                .collect()
    }

    public void setStudentsNameAndAvgAssessment(List<Student> studentList) {
        this.studentsNameAndAvgAssessment = studentsNameAndAvgAssessment;
    }
}
