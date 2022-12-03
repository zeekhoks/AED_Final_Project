/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UniversityManagement;

/**
 *
 * @author zainabkhokawala
 */
public class Person {
    public enum UserRole{
        UNIVERSITY_ADMIN,
        STUDENT,
        PROFESSOR,
        PLACEMENT_COORDINATOR,
        EVENT_COORDINATOR,
        ACCOUNTS_ADMIN,
        DEPARTMENT_ADMIN
    }
    
    private String personFullName;
    private String personGender;
    private int personAge;
    private long personPhoneNumber;
    private String personEmailAddress;
    private long userName;
    private String city;
    private String community;
    private long zipCode;
    private long userPassword;
    private UserRole userRole;

    public String getPersonFullName() {
        return personFullName;
    }

    public void setPersonFullName(String personFullName) {
        this.personFullName = personFullName;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public long getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(long personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

    public long getUserName() {
        return userName;
    }

    public void setUserName(long userName) {
        this.userName = userName;
    }

    public long getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(long userPassword) {
        this.userPassword = userPassword;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getPersonEmailAddress() {
        return personEmailAddress;
    }

    public void setPersonEmailAddress(String personEmailAddress) {
        this.personEmailAddress = personEmailAddress;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }
    
}
