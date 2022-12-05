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
    public String firstName;
    public String lastName;
    public int personID;
    public String email;
    public String password;
    public String role;
    public String dob;
    public long mobileNo;
    public String gender;
    public Community community;

    public Person(String firstName, String lastName, int personID, String email, String password, String role, String dob, long mobileNo, String gender, Community community) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personID = personID;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dob = dob;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.community = community;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
}
