package com.mentoring.level2.streamHW.student;

public class Assessment {

    private String subject;
    private int assessment;

    public Assessment(String subject, int assessment) {
        this.subject = subject;
        this.assessment = assessment;
    }

    public String getSubject() {
        return subject;
    }

    public int getAssessment() {
        return assessment;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "subject='" + subject + '\'' +
                ", assessment=" + assessment +
                '}';
    }
}
