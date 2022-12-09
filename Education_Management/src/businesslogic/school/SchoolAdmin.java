/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

import businesslogic.Community;
import businesslogic.Person;

/**
 *
 * @author drashtibhingradiya
 */
public class SchoolAdmin extends Person {
    private String schoolCode;
    
    public SchoolAdmin(String firstName, String lastName, String gender, String personID, 
            String dob, long mobileNo, String email, Community community, 
            String password, UserRole role, String schoolCode) {
        super(firstName, lastName, gender, 
                personID, dob, (long) mobileNo, email, 
                community, password, role.SCHOOL_ADMIN);
        this.schoolCode = schoolCode;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }
    
}
