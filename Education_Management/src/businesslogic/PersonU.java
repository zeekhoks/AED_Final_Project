/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic;

import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class PersonU {
    public enum UserRole{
        UNIVERSITY_ADMIN,
        STUDENT,
        PROFESSOR,
        PLACEMENT_COORDINATOR,
        EVENT_COORDINATOR,
        ACCOUNTS_ADMIN,
        DEPARTMENT_ADMIN,
        MEALPLAN_ADMIN
    }
    
    private String personName;
    private String personGender;
    private String personId;
    private Date dateOfBirth;
    private long personPhoneNumber;
    private String personEmailAddress;
    private Community community;
    private String userPassword;
    private UserRole userRole;


    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
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
