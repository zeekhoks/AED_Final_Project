/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.Community;
import java.util.Date;
import businesslogic.Person;
/**
 *
 * @author zainabkhokawala
 */
public class Professor extends Person {
    
    private String professorID;
    private Date startDate;
    
        public Professor(String personFirstName, String personLastName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword, UserRole userRole, String sprofessorID, Date startDate) {
            
        this.setPersonFirstName(personFirstName);
        this.setPersonLastName(personLastName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(userRole);
        this.setProfessorID(professorID);
        this.setStartDate(startDate);
        }
    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    
    
}
