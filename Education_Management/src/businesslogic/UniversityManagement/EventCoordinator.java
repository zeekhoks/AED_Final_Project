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
public class EventCoordinator extends PersonU {
    
    private String eventCordID;
    private Date startDate;
    private String instituteCode;
    
   public EventCoordinator(String personName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword, UserRole userRole, String eventCordID, Date startDate, String instituteCode) {
            
        this.setPersonName(personName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(userRole.EVENT_COORDINATOR);
        this.setEventCordID(eventCordID);
        this.setStartDate(startDate);
        this.setInstituteCode(instituteCode);
        }

    public String getEventCordID() {
        return eventCordID;
    }

    public void setEventCordID(String eventCordID) {
        this.eventCordID = eventCordID;
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
