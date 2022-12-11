/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

/**
 *
 * @author zainabkhokawala
 */
public class CourseAssignment {
    
    private String studentID;
    private String professorName;
 
    private int courseID;
    private float grade;

    public CourseAssignment(String studentID, String professorName,  int courseID, float grade) {
        this.studentID = studentID;
        this.professorName = professorName;
        this.courseID = courseID;
        this.grade = grade;
    }
    

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

 
    
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
    
    
    
    
}
