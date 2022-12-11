/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.Community;

/**
 *
 * @author zainabkhokawala
 */
public class University {
    
    private String universityID;
    private String universityName;
    private Community community;
    private String universityAdminEmail;
    private String universityAdminPassword;

    public University(String universityID, String universityName, 
            Community community, String universityAdminEmail, String universityAdminPassword) {
        this.universityID = universityID;
        this.universityName = universityName;
        this.community = community;
        this.universityAdminEmail = universityAdminEmail;
        this.universityAdminPassword = universityAdminPassword;
    }

    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getUniversityAdminEmail() {
        return universityAdminEmail;
    }

    public void setUniversityAdminEmail(String universityAdminEmail) {
        this.universityAdminEmail = universityAdminEmail;
    }

    public String getUniversityAdminPassword() {
        return universityAdminPassword;
    }

    public void setUniversityAdminPassword(String universityAdminPassword) {
        this.universityAdminPassword = universityAdminPassword;
    }
    
    @Override
    public String toString(){
        return universityID;
    }
}
