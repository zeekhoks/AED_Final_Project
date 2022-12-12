/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic;

//import model.Community;

/**
 *
 * @author drashtibhingradiya
 */
public class Person {
    public enum UserRole{
        UNIVERSITY_ADMIN,
        STUDENT,
        PROFESSOR,
        PLACEMENT_COORDINATOR,
        EVENT_COORDINATOR,
        ACCOUNTS_ADMIN,
        DEPARTMENT_ADMIN,
        PARENT,
        SYSTEM_ADMIN,
        SCHOOL_ADMIN,
        SCHOOL_TEACHER
    }
    
    public String personFirstName;
    private String personLastName;
    private String personGender;
    private String personId;
    private String dateOfBirth;
    private long personPhoneNumber;
    private String personEmailAddress;
    private Community community;
    private String userPassword;
    private UserRole userRole;

    public Person(String personFirstName, String personLastName, String personGender, String personId, String dateOfBirth, 
            long personPhoneNumber, String personEmailAddress, Community community, String userPassword, UserRole userRole) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.personGender = personGender;
        this.personId = personId;
        this.dateOfBirth = dateOfBirth;
        this.personPhoneNumber = personPhoneNumber;
        this.personEmailAddress = personEmailAddress;
        this.community = community;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

   public String getPersonGender() {
        return personGender;
    }

   public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

   public String getDateOfBirth() {
        return dateOfBirth;
    }

   public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



   public long getPersonPhoneNumber() {
        return personPhoneNumber;
    }

   public void setPersonPhoneNumber(long personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

   public String getUserPassword() {
        return userPassword;
    }

   public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

   public UserRole getUserRole() {
        return userRole;
    }

   public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

   public String getPersonEmailAddress() {
        return personEmailAddress;
    }

   public void setPersonEmailAddress(String personEmailAddress) {
        this.personEmailAddress = personEmailAddress;
    }

   public String getPersonFirstName() {
        return personFirstName;
    }

   public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

   public String getPersonLastName() {
        return personLastName;
    }

   public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

   public String getPersonId() {
        return personId;
    }

   public void setPersonId(String personId) {
        this.personId = personId;
    }

   public Community getCommunity() {
        return community;
    }

   public void setCommunity(Community community) {
        this.community = community;
    }
}
