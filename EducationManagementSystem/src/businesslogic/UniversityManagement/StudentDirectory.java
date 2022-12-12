/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

import java.util.ArrayList;

/**
 *
 * @author zainabkhokawala
 */
public class StudentDirectory {
    
    private ArrayList<Student> studentDirectory;
    
    public StudentDirectory(){
        this.studentDirectory = new ArrayList<>();
        
    }

    public ArrayList<Student> getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(ArrayList<Student> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    
}
