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
public class StudentMealPlanDirectory {
    
    private ArrayList<Course> studentMealPlanDirectory;

    public StudentMealPlanDirectory() {
        this.studentMealPlanDirectory = new ArrayList<>();
    }

    public ArrayList<Course> getStudentMealPlanDirectory() {
        return studentMealPlanDirectory;
    }

    public void setStudentMealPlanDirectory(ArrayList<Course> studentMealPlanDirectory) {
        this.studentMealPlanDirectory = studentMealPlanDirectory;
    }
    
    
}
