/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UniversityManagement;
import model.UniversityManagement.Course;
import model.UniversityManagement.Professor;
import model.UniversityManagement.Student;
import model.UniversityManagement.Grades;

/**
 *
 * @author zainabkhokawala
 */
public class Department {
    
    private int semester;
    private Professor professor;
    private Student student;
    private Course course;

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    
    
}
