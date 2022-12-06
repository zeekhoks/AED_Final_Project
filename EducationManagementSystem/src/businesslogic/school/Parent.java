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
public class Parent extends Person{
    private int studentID;

    public Parent(String firstName, String lastName, int personID, String email, String password, String role, String dob, long mobileNo, String gender, Community community, int studentID) {
        super(firstName, lastName, personID, email, password, role, dob, mobileNo, gender, community);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
   
}
