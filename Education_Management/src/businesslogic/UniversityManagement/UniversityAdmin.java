/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.City;
import businesslogic.Community;
import businesslogic.PersonU;
import businesslogic.PersonUDirectory;
import businesslogic.CommunityDirectory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zainabkhokawala
 */
public class UniversityAdmin extends PersonU {
    
    private String universityID;
    public static List<String> semesterList = new ArrayList<String>();
        
    public UniversityAdmin(String personName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword,  String universityID) {
            
        this.setPersonName(personName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(UserRole.UNIVERSITY_ADMIN);
        this.setUniversityID(universityID);
        
     }
    static{
    
        semesterList.add("Select Semester");
        semesterList.add("Fall 2022");
        semesterList.add("Winter 2022");
        semesterList.add("Spring 2023");
        semesterList.add("Summer 2023");
        semesterList.add("Fall 2023");
        semesterList.add("Winter 2023");
        semesterList.add("Spring 2024");
        semesterList.add("Summer 2024");

    }
    
    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    public static List<String> getSemesterList() {
        return semesterList;
    }

    public static void setSemesterList(List<String> semesterList) {
        UniversityAdmin.semesterList = semesterList;
    }
    
    
}
