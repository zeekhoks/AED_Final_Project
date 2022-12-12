/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class SchoolStudentMealPlanDirectory {
        private ArrayList<SchoolStudentMealPlan> studentMealPlanDirectory;

    public SchoolStudentMealPlanDirectory() {
        studentMealPlanDirectory = new ArrayList<SchoolStudentMealPlan>();
    }      

    public ArrayList<SchoolStudentMealPlan> getStudentMealPlanDirectory() {
        return studentMealPlanDirectory;
    }

    public void setStudentMealPlanDirectory(ArrayList<SchoolStudentMealPlan> studentMealPlanDir) {
        studentMealPlanDirectory = studentMealPlanDir;
    }

    public SchoolStudentMealPlan addNewMealPlan(SchoolStudentMealPlan schoolStudentMealPlan) {
        studentMealPlanDirectory.add(schoolStudentMealPlan);
        return schoolStudentMealPlan;
    }
    
    
}
