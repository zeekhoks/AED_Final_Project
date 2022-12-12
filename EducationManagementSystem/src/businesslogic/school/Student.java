/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic.school;

import businesslogic.Community;
import businesslogic.PersonU;

/**
 *
 * @author drashtibhingradiya
 */
public class Student extends PersonU{
    private int schoolID;
    private String extraCurricular;
    private int standard;

    public Student(String firstName, String lastName, int personID, 
            String email, String password, String role, String dob, 
            long mobileNo, String gender, Community community, int schoolID, String extraCurricular, int standard) {
//        super(firstName, lastName, personID, email, password, role="Student", dob, mobileNo, gender, community);
        this.schoolID = schoolID;
        this.extraCurricular = extraCurricular;
        this.standard = standard;
    }
   
    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getExtraCurricular() {
        return extraCurricular;
    }

    public void setExtraCurricular(String extraCurricular) {
        this.extraCurricular = extraCurricular;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
    
    
}
