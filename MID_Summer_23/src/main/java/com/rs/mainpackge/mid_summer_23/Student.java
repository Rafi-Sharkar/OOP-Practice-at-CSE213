package com.rs.mainpackge.mid_summer_23;

public class Student {
    private int studentID;
    private boolean hasScholarship;
    private int scholarshipRate;

    public Student(int studentID, boolean hasScholarship, int scholarshipRate) {
        this.studentID = studentID;
        this.hasScholarship = hasScholarship;
        this.scholarshipRate = scholarshipRate;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    public int getScholarshipRate() {
        return scholarshipRate;
    }

    public void setScholarshipRate(int scholarshipRate) {
        this.scholarshipRate = scholarshipRate;
    }
}
