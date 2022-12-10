/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;


/**
 *
 * @author zainabkhokawala
 */
public class Course {
    
    private int courseID;
    private String courseName;
    private String professorName;
    private int creditHours;
    private String courseDescription;
    private String semester;
    private String studentMajor;

    public Course(int courseID, String courseName, String professorName, 
            int creditHours, String courseDescription,  String semester, String studentMajor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.professorName = professorName;
        this.creditHours = creditHours;
        this.courseDescription = courseDescription;
        this.semester = semester;
        this.studentMajor = studentMajor;
    }
    
    

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }



    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }
    
    
    
}
