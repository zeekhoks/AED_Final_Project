/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.MealManagement;

import businesslogic.Community;
import businesslogic.PersonU;
import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class MealPlanAdmin extends PersonU{
    
    private long mealPlanAdminID;
    
    public MealPlanAdmin(String personName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword, long mealPlanAdminID){
        
        this.setPersonName(personName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(UserRole.MEALPLAN_ADMIN);
        this.setMealPlanAdminID(mealPlanAdminID);
        
        
    }

    public long getMealPlanAdminID() {
        return mealPlanAdminID;
    }

    public void setMealPlanAdminID(long mealPlanAdminID) {
        this.mealPlanAdminID = mealPlanAdminID;
    }
    
    
    
}
