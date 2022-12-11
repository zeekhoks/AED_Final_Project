/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.MealManagement;

import businesslogic.PersonU;
import businesslogic.UniversityManagement.University;
import java.util.ArrayList;

/**
 *
 * @author zainabkhokawala
 */
public class MealPlanDirectory {
    
        private ArrayList<MealPlan> mealPlanDirectory;

    public MealPlanDirectory() {
        this.mealPlanDirectory = new ArrayList<>();
    }

    public ArrayList<MealPlan> getMealPlanDirectory() {
        return mealPlanDirectory;
    }

    public void setMealPlanDirectory(ArrayList<MealPlan> meanPlanDirectory) {
        this.mealPlanDirectory = mealPlanDirectory;
    }
    
    public MealPlan getPlanByCode(int mealCode) {
        for(MealPlan m : mealPlanDirectory) {
            if(m.getMealID() == mealCode){
                return m;
            }
        }
        return null;
    }    
    
    
}
