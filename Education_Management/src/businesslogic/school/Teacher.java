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
public class Teacher extends Person {
    private String schoolCode;
    private String dateOfJoining;

    public Teacher(String personFirstName, String personLastName, String personGender, 
            String personId, String dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword, UserRole userRole,
            String schoolCode, String dateOfJoining) {
        super(personFirstName, personLastName, personGender, personId, dateOfBirth, 
                personPhoneNumber, personEmailAddress, community, userPassword, userRole.SCHOOL_TEACHER);
        this.schoolCode = schoolCode;
        this.dateOfJoining = dateOfJoining;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
    
    @Override
    public String toString(){
        return personFirstName;
    }
    
}
