/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.Community;
import businesslogic.PersonU;
import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class PlacementCoordinator extends PersonU{
    
    private String placementCordID;
    private Date startDate;
    private String instituteCode;
    
         public PlacementCoordinator(String personName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword, UserRole userRole, String placementCordID, Date startDate, 
            String institueCode) {
            
        this.setPersonName(personName);
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
        this.setInstituteCode(instituteCode);
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

    public String getInstituteCode() {
        return instituteCode;
    }

    public void setInstituteCode(String instituteCode) {
        this.instituteCode = instituteCode;
    }
    
    
    
}
