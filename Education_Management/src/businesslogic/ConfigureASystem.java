package businesslogic;


import businesslogic.EcoSystem;
import businesslogic.MealManagement.MealPlan;
import businesslogic.MealManagement.MealPlanAdmin;
import businesslogic.UniversityManagement.Degree;
import businesslogic.UniversityManagement.Professor;
import businesslogic.UniversityManagement.StudentU;
import businesslogic.UniversityManagement.UniversityAdmin;
import businesslogic.school.SchoolAdmin;
import businesslogic.school.Student;
import businesslogic.school.Subject;
import businesslogic.school.Teacher;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author drashtibhingradiya
 */
public class ConfigureASystem {
    public static EcoSystem configure() {
        
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
//        ecoSystem.getCityDirectory().addCity(new City("Boston"));
//        ecoSystem.getCommunityDirectory().addCommunity(new Community("JP", new City("Boston")));
        Community c = ecoSystem.getCommunityDirectory().addNewCommunity();
        c.setCommunity("JP");
        c.setCity(new City("Boston"));
        
        ecoSystem.getPersonDirectory().getPersonDirectory().add(new Person(null,null,null, null,
                null,1234567890,"systemAdmin@gmail.com",c,
                "1234", Person.UserRole.SYSTEM_ADMIN));
    
// School Admin
        ecoSystem.getSchoolAdminDirectory().getSchoolAdminDirectory().add(new SchoolAdmin(null,null,null, null,
                null,1234567890,"schoolAdmin@gmail.com",c,"1234", Person.UserRole.SCHOOL_ADMIN, "s01"));
        
    // teacher
        ecoSystem.getTeacherDirectory().getTeacherDirectory().add(new Teacher("John", "Due", "Male", 
                "school0101", "1980-02-02", 1234567890, "John@gmail.com", c, 
                "1234", Person.UserRole.SCHOOL_TEACHER, "s01", "2010-09-09"));
        
        ecoSystem.getTeacherDirectory().getTeacherDirectory().add(new Teacher("Eric", "Rah", "Male", 
                "school0102", "1980-02-02", 1234567890, "Eric@gmail.com", c, 
                "1234", Person.UserRole.SCHOOL_TEACHER, "s01", "2010-09-09"));
        
        ecoSystem.getTeacherDirectory().getTeacherDirectory().add(new Teacher("Dough", "Gori", "Male", 
                "school0103", "1980-02-02", 1234567890, "Dough@gmail.com", c, 
                "1234", Person.UserRole.SCHOOL_TEACHER, "s01", "2010-09-09"));
        
    // subject
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(100, "Science", 1, "Eric"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(101, "English", 1, "John"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(102, "Maths", 1, "Eric"));
    
    // student
        ArrayList<Subject> standardSub = (ArrayList<Subject>) ecoSystem.getSubjectDirectory().getSubjectDirectory().stream()
                    .filter(customer -> customer.getStandard() == 1)
                    .collect(Collectors.toList());
        ecoSystem.getStudentDirectory().getStudentDirectory().add(new Student("Yesha", "Patel", "Female", "s0101", 
                "2000-01-01", 1234567890, "yesha@gmail.com", c, "1234", Person.UserRole.STUDENT, 
                "s01", "Dance", 1, 
                "/Users/drashtibhingradiya/Desktop/github-projects/AED_Final_Project/Education_Management/src/icons/default.jpg", 
                standardSub));
        
        ecoSystem.getStudentDirectory().getStudentDirectory().add(new Student("Yuve", "Su", "Male", "s0102", 
                "2000-04-03", 1234567890, "yuve@gmail.com", c, "1234", Person.UserRole.STUDENT, 
                "s01", "Music", 1, 
                "/Users/drashtibhingradiya/Desktop/github-projects/AED_Final_Project/Education_Management/src/icons/default.jpg", 
                standardSub));
        
    //meal plan admin
        ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new MealPlanAdmin("John Doe", 
                "Male", "123458", null, 1234322L, "john@gmail.com", 
                new Community ("Boylston", new City ("Boson")), "1234", "12"));
        
    //meal plan    
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().add(new MealPlan(10, "Day Plan", "Vegan", "Salad Bowl"));
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().add(new MealPlan(11, "Week Plan", "Vegeterian", "Curry"));

        
    // Dormitory system Admin
     ecoSystem.getLoginDetails().addAdminkeyValue("hinal","0000" );
     
     
    // university
    ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new UniversityAdmin("Zainab",
                "Female", "123456", null, 12345677L, "zk@gmail.com", new Community("Park Drive", new City("Boston")), "zk123", "U01"));

        ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new StudentU("Hinal", "Female",
                "123457", null, 12345687L, "hp@gmail.com",
                new Community("Westland Avenue",
                        new City("Boston")), "hp123", 
                "U0101", new Degree("Graduate", "Information Systems"),
                "2024", "photo", "U01"));
//        ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new MealPlanAdmin("John Doe", 
//                "Male", "123458", null, 1234322L, "jd@gmail.com", 
//                new Community ("Boylston", new City ("Boson")), "jd123", "13"));
        
       ecoSystem.getProfessorDirectoryRef().getProfessorDirectory().add(new Professor("Rachel Ross", "Female", 
               "123459",new Date(1997, 07, 26), 1234222L, "rr@gmail.com", 
               new Community ("Boylston", new City ("Boson")), 
       "rr123", "U010101", "U01"));
        
  
        return ecoSystem;
    }
}
