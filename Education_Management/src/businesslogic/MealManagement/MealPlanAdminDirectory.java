/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.MealManagement;

import businesslogic.UniversityManagement.UniversityAdmin;
import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class MealPlanAdminDirectory {
    private static ArrayList<MealPlanAdmin> mealPlanAdminDirectory;
    
    public MealPlanAdminDirectory() {
        mealPlanAdminDirectory = new ArrayList<MealPlanAdmin>();
    }

    public static ArrayList<MealPlanAdmin> getMealPlanAdminDirectory() {
        return mealPlanAdminDirectory;
    }

    public static void setMealPlanAdminDirectory(ArrayList<MealPlanAdmin> mealPlanAdminDirectory) {
        MealPlanAdminDirectory.mealPlanAdminDirectory = mealPlanAdminDirectory;
    }
    
    public MealPlanAdmin getMealPlanAdminByEmail(String mealPlanAdminEmail) {
        for(MealPlanAdmin p : mealPlanAdminDirectory) {
           if(p.getPersonEmailAddress().equals(mealPlanAdminEmail)){
               return p;
           }
       }
       return null;
    }
    
    public MealPlanAdmin addNewAdmin(MealPlanAdmin m) {
        mealPlanAdminDirectory.add(m);
        return m;
    }
    
    public MealPlanAdmin authenticateAdmin(String userName, String password) {
        
        MealPlanAdmin user = mealPlanAdminDirectory.stream().filter(
                l -> l.getPersonEmailAddress().equals(userName) && 
                        l.getUserPassword().equals(password)).findFirst().orElse(null);
        return user;
        }
}
