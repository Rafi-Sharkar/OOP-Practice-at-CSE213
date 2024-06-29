package rs.studentprofile;

public class Student {
    private String stuName;
    private String stuID;
    private String stuGender;
    private String stuDOB;
    private String nationlity;

    public Student(String stuName, String stuID,String stuGender, String stuDOB, String nationlity) {
        this.stuName = stuName;
        this.stuID = stuID;
        this.stuGender = stuGender;
        this.stuDOB = stuDOB;
        this.nationlity = nationlity;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String isStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuDOB() {
        return stuDOB;
    }

    public void setStuDOB(String stuDOB) {
        this.stuDOB = stuDOB;
    }

    public String getNationlity() {
        return nationlity;
    }

    public void setNationlity(String nationlity) {
        this.nationlity = nationlity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuID='" + stuID + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuDOB='" + stuDOB + '\'' +
                ", nationlity='" + nationlity + '\'' +
                '}';
    }
}
