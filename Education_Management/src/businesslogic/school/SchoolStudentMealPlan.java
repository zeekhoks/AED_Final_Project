/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

/**
 *
 * @author drashtibhingradiya
 */
public class SchoolStudentMealPlan {
    private String studentID;
    private int mealID;

    public SchoolStudentMealPlan(String studentID, int mealID) {
        this.studentID = studentID;
        this.mealID = mealID;
    }

    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getMealID() {
        return mealID;
    }

    public void setMealID(int mealID) {
        this.mealID = mealID;
    }
       
}
