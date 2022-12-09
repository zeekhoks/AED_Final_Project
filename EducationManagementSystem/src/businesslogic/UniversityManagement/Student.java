/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.Community;
import businesslogic.Person;
import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class Student extends Person{
    
    private String studentID;
    private String instituteCode;
    private Degree studentDegree;
    private String graduationYear;
    private String currentSemester;
    private String photo;
    
    
    public Student(String personFirstName, String personLastName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword, String studentID, String instituteCode,
            Degree studentDegree, String graduationYear,  String currentSemester, String photo) {
            
        this.setPersonFirstName(personFirstName);
        this.setPersonLastName(personLastName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(UserRole.STUDENT);
        this.setStudentID(studentID);
        this.setInstituteCode(instituteCode);
        this.setStudentDegree(studentDegree);
        this.setGraduationYear(graduationYear);
        this.setCurrentSemester(currentSemester);
        this.setPhoto(photo);
    }
    
    

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getInstituteCode() {
        return instituteCode;
    }

    public void setInstituteCode(String instituteCode) {
        this.instituteCode = instituteCode;
    }

    public Degree getStudentDegree() {
        return studentDegree;
    }

    public void setStudentDegree(Degree studentDegree) {
        this.studentDegree = studentDegree;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(String currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
}
