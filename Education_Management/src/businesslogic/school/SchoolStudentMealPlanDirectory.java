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
        private static ArrayList<SchoolStudentMealPlan> studentMealPlanDirectory;

    public SchoolStudentMealPlanDirectory() {
        studentMealPlanDirectory = new ArrayList<SchoolStudentMealPlan>();
    }      

    public static ArrayList<SchoolStudentMealPlan> getStudentMealPlanDirectory() {
        return studentMealPlanDirectory;
    }

    public static void setStudentMealPlanDirectory(ArrayList<SchoolStudentMealPlan> studentMealPlanDirectory) {
        SchoolStudentMealPlanDirectory.studentMealPlanDirectory = studentMealPlanDirectory;
    }

    public SchoolStudentMealPlan addNewMealPlan(SchoolStudentMealPlan schoolStudentMealPlan) {
        studentMealPlanDirectory.add(schoolStudentMealPlan);
        return schoolStudentMealPlan;
    }
    
    
}
