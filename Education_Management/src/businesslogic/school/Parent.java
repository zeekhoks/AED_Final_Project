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
    private String studentID;

    public Parent(String firstName, String lastName, String gender, String personID, 
            String dob, long mobileNo, String email, Community community, 
            String password, UserRole role, String studentID) {
        super(firstName, lastName, gender, 
                personID, dob, (long) mobileNo, email, 
                community, password, role.PARENT);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
   
}
