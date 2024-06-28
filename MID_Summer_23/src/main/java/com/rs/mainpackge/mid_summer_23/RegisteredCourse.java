package com.rs.mainpackge.mid_summer_23;

public class RegisteredCourse {
    private String courseID;
    private int courseCredit;
    private int section;

    public RegisteredCourse(String courseID, int courseCredit) {
        this.courseID = courseID;
        this.courseCredit = courseCredit;
    }

    public RegisteredCourse(String courseID, int courseCredit, int section) {
        this.courseID = courseID;
        this.courseCredit = courseCredit;
        this.section = section;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
