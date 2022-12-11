/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

/**
 *
 * @author zainabkhokawala
 */
public class StudentMealPlan {
    
    private String studentID;
    private int mealPlanID;

    public StudentMealPlan(String studentID, int mealPlanID) {
        this.studentID = studentID;
        this.mealPlanID = mealPlanID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getMealPlanID() {
        return mealPlanID;
    }

    public void setMealPlanID(int mealPlanID) {
        this.mealPlanID = mealPlanID;
    }
    
    
    
}
