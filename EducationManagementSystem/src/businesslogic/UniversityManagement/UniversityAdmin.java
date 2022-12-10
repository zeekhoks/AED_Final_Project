/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import businesslogic.City;
import businesslogic.Community;
import businesslogic.Person;
import businesslogic.PersonDirectory;
import businesslogic.CommunityDirectory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zainabkhokawala
 */
public class UniversityAdmin extends Person {
    
    public static StudentDirectory studentDirectoryRef = new StudentDirectory();
    public static ProfessorDirectory professorDirectoryRef = new ProfessorDirectory();
    public static CourseDirectory courseDirectoryRef = new CourseDirectory();
    public static AppointmentDirectory appointmentDirectoryRef = new AppointmentDirectory();
    public static PersonDirectory personDirectoryRef = new PersonDirectory();
    public static CommunityDirectory communityDirectoryRef = new CommunityDirectory();
    public static List<String> semesterList = new ArrayList<String>();
    public static CourseAssignmentDirectory courseAssignmentRef = new CourseAssignmentDirectory();
        
    public UniversityAdmin(String personName, String personGender, 
            String personId, Date dateOfBirth, long personPhoneNumber, String personEmailAddress, 
            Community community, String userPassword) {
            
        this.setPersonName(personName);
        this.setPersonGender(personGender);
        this.setPersonId(personId);
        this.setDateOfBirth(dateOfBirth);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setPersonEmailAddress(personEmailAddress);
        this.setCommunity(community);
        this.setUserPassword(userPassword);
        this.setUserRole(UserRole.UNIVERSITY_ADMIN);
        
     }
    
    
    static {
        
        
        
        personDirectoryRef.getPersonDirectory().add(new UniversityAdmin("Zainab",
                "Female", "123456", new Date (1997, 07,26), 12345677L, 
                "zk@gmail.com",
                new Community("Park Drive", new City("Boston")), "zk123"));
             
        personDirectoryRef.getPersonDirectory().add(new Student("Hinal", "Female", 
        "123457", new Date (1997, 11,21), 12345687L, "hp@gmail.com", new Community("Westland Avenue", 
                new City("Boston")), "hp123", "12", new Degree("Graduate","Information Systems"), 
                "2024", "photo"));
        
        
                semesterList.add("Select Semester");
                semesterList.add("Fall 2022");
                semesterList.add("Winter 2022");
                semesterList.add("Spring 2023");
                semesterList.add("Summer 2023");
                semesterList.add("Fall 2023");
                semesterList.add("Winter 2023");
                semesterList.add("Spring 2024");
                semesterList.add("Summer 2024");

    }
    
    
}
