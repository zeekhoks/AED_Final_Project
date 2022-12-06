/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.Community;
import businesslogic.Person;
import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class PlacementCoordinator extends Person{
    
    private String placementCordID;
    private Date startDate;
    
         public PlacementCoordinator(String personFirstName, String personLastName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword, UserRole userRole, String placementCordID, Date startDate) {
            
        this.setPersonFirstName(personFirstName);
        this.setPersonLastName(personLastName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(userRole.PLACEMENT_COORDINATOR);
        this.setPlacementCordID(placementCordID);
        this.setStartDate(startDate);
        }

    public String getPlacementCordID() {
        return placementCordID;
    }

    public void setPlacementCordID(String placementCordID) {
        this.placementCordID = placementCordID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    
    
}
