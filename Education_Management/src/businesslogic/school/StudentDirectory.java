/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model.school;

import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class StudentDirectory {
    private static ArrayList<Student> studentDirectory;
    
    public StudentDirectory(){
        studentDirectory = new ArrayList<Student>();
    }

    public static ArrayList<Student> getStudentDirectory() {
        return studentDirectory;
    }

    public static void setStudentDirectory(ArrayList<Student> studentDirectory) {
        StudentDirectory.studentDirectory = studentDirectory;
    }
}
