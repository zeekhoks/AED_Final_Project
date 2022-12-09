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
    private String professorID;
    private int courseID;
    private float grade;

    public CourseAssignment(String studentID, String professorID, int courseID, float grade) {
        this.studentID = studentID;
        this.professorID = professorID;
        this.courseID = courseID;
        this.grade = grade;
    }
    

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
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
    
    
    
    
}
