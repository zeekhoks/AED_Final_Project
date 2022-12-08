/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic.school;

import businesslogic.Community;
import businesslogic.Person;

/**
 *
 * @author drashtibhingradiya
 */
//    Person class attributes:
//    private String personFirstName;
//    private String personLastName;
//    private String personGender;
//    private String personId;
//    private String dateOfBirth;
//    private long personPhoneNumber;
//    private String personEmailAddress;
//    private Community community;
//    private long userPassword;
//    private Person.UserRole userRole;

//    public Person(String personFirstName, String personLastName, String personGender, String personId, String dateOfBirth, long personPhoneNumber, String personEmailAddress, Community community, long userPassword, Person.UserRole userRole) {
//        this.personFirstName = personFirstName;
//        this.personLastName = personLastName;
//        this.personGender = personGender;
//        this.personId = personId;
//        this.dateOfBirth = dateOfBirth;
//        this.personPhoneNumber = personPhoneNumber;
//        this.personEmailAddress = personEmailAddress;
//        this.community = community;
//        this.userPassword = userPassword;
//        this.userRole = userRole;
//    }


public class Student extends Person{
    private String schoolCode;
    private String extraCurricular;
    private int standard;
    private String photo;

    public Student(String firstName, String lastName, String gender, String personID, 
            String dob, long mobileNo, String email, Community community, 
            String password, UserRole role, 
            String schoolCode, String extraCurricular, int standard, String photo) {
        super(firstName, lastName, gender, 
                personID, dob, (long) mobileNo, email, 
                community, password, role.STUDENT);
        this.schoolCode = schoolCode;
        this.extraCurricular = extraCurricular;
        this.standard = standard;
        this.photo = photo;
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

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    @Override
    public String toString(){
        return personFirstName;
    }
}
