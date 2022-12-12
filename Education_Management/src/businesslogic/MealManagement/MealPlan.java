/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.MealManagement;

/**
 *
 * @author zainabkhokawala
 */
public class MealPlan {
    private int mealID;
    private String mealPlan;
    private String mealDescription;
    private String mealType;

    public MealPlan(int mealID, String mealPlan, String mealDescription, String mealType) {
        this.mealID = mealID;
        this.mealPlan = mealPlan;
        this.mealDescription = mealDescription;
        this.mealType = mealType;
    }

    public int getMealID() {
        return mealID;
    }

    public void setMealID(int mealID) {
        this.mealID = mealID;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
    
    @Override
    public String toString(){
        return String.valueOf(mealID);
    }
}
