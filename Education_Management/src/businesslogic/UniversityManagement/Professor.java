/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.Community;
import java.util.Date;
import businesslogic.PersonU;
/**
 *
 * @author zainabkhokawala
 */
public class Professor extends PersonU {
    
    private String professorID;
    private String universityID;
        public Professor(String personName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword,  String professorID, 
            String universityID) {
            
        this.setPersonName(personName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(UserRole.PROFESSOR);
        this.setProfessorID(professorID);
        this.setUniversityID(universityID);
        }
    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
    }

    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    
    
    
}
