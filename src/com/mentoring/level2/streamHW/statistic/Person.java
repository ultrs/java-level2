package com.mentoring.level2.streamHW.statistic;

public class Person {

    private String fullName;
    private double avgAssessment;

    public Person(String fullName, double avgAssessment) {
        this.fullName = fullName;
        this.avgAssessment = avgAssessment;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setAvgAssessment(double avgAssessment) {
        this.avgAssessment = avgAssessment;
    }

    public String getFullName() {
        return fullName;
    }
    public double getAvgAssessment() {
        return avgAssessment;
    }

    @Override
    public String toString() {
        return "\nСтудент: " + fullName + '\'' +
                ", средняя оценка: " + avgAssessment;
    }
}
