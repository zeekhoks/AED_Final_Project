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
        
        Community com = ecoSystem.getCommunityDirectory().addNewCommunity();
        com.setCommunity("Roxburry");
        com.setCity(new City("Boston"));
        
        ecoSystem.getPersonDirectory().getPersonDirectory().add(new Person(null,null,null, null,
                null,1234567890,"systemAdmin@gmail.com",c,
                "1234", Person.UserRole.SYSTEM_ADMIN));
    
// School Admin
        ecoSystem.getSchoolAdminDirectory().getSchoolAdminDirectory().add(new SchoolAdmin(null,null,null, null,
                null,1234567890,"schoolAdmin@gmail.com",c,"1234", Person.UserRole.SCHOOL_ADMIN, "s01"));
        
    // teacher
        ecoSystem.getTeacherDirectory().getTeacherDirectory().add(new Teacher("John", "Due", "Male", 
                "s011", "1988-02-02", 1234567890, "John@gmail.com", c, 
                "1234", Person.UserRole.SCHOOL_TEACHER, "s01", "2011-09-09"));
        
        ecoSystem.getTeacherDirectory().getTeacherDirectory().add(new Teacher("Eric", "Rah", "Male", 
                "s012", "1996-02-02", 1234567890, "Eric@gmail.com", com, 
                "1234", Person.UserRole.SCHOOL_TEACHER, "s01", "2000-09-09"));
        
        ecoSystem.getTeacherDirectory().getTeacherDirectory().add(new Teacher("Dough", "Gori", "Male", 
                "s013", "1970-02-02", 1234567890, "Dough@gmail.com", c, 
                "1234", Person.UserRole.SCHOOL_TEACHER, "s01", "2010-08-09"));
        ecoSystem.getTeacherDirectory().getTeacherDirectory().add(new Teacher("Smita", "Shah", "Female", 
                "s014", "1980-01-02", 1234567890, "Smita@gmail.com", com, 
                "1234", Person.UserRole.SCHOOL_TEACHER, "s01", "2010-09-10"));
        
        
    // subject
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(100, "Science", 1, "Eric"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(101, "English", 1, "John"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(102, "Maths", 1, "Eric"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(103, "Science", 2, "Smita"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(104, "English", 2, "Dough"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(105, "Maths", 2, "Eric"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(106, "Science", 3, "Smita"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(107, "English", 3, "Eric"));
        ecoSystem.getSubjectDirectory().getSubjectDirectory().add(new Subject(108, "Maths", 3, "John"));
        
    
    // student
        ArrayList<Subject> standardSub1 = (ArrayList<Subject>) ecoSystem.getSubjectDirectory().getSubjectDirectory().stream()
                    .filter(customer -> customer.getStandard() == 1)
                    .collect(Collectors.toList());
        ArrayList<Subject> standardSub2 = (ArrayList<Subject>) ecoSystem.getSubjectDirectory().getSubjectDirectory().stream()
                    .filter(customer -> customer.getStandard() == 2)
                    .collect(Collectors.toList());
        ArrayList<Subject> standardSub3 = (ArrayList<Subject>) ecoSystem.getSubjectDirectory().getSubjectDirectory().stream()
                    .filter(customer -> customer.getStandard() == 3)
                    .collect(Collectors.toList());
        
        Student s = ecoSystem.getStudentDirectory().addNewStudent(new Student("Yesha", "Patel", "Female", "s0101", 
                "2000-01-01", 1234567890, "yesha@gmail.com", c, "1234", Person.UserRole.STUDENT, 
                "s01", "Dance", 1, 
                "/Users/drashtibhingradiya/Desktop/github-projects/AED_Final_Project/Education_Management/src/icons/student.jpg", 
                standardSub1));
        s.addGrades(100, 90.5);
        s.addGrades(101,88.9);
        s.addGrades(102,100);
        
        ecoSystem.getStudentDirectory().getStudentDirectory().add(new Student("Yuve", "Su", "Male", "s0102", 
                "2000-04-03", 1234567890, "yuve@gmail.com", c, "1234", Person.UserRole.STUDENT, 
                "s01", "Music", 2, 
                "/Users/drashtibhingradiya/Desktop/github-projects/AED_Final_Project/Education_Management/src/icons/default.jpg", 
                standardSub2));
        
        ecoSystem.getStudentDirectory().getStudentDirectory().add(new Student("Ronak", "Agnani", "Male", "s0103", 
                "2010-04-03", 1234567890, "ronak@gmail.com", com, "1234", Person.UserRole.STUDENT, 
                "s01", "Sports", 3, 
                "/Users/drashtibhingradiya/Desktop/github-projects/AED_Final_Project/Education_Management/src/icons/student2.jpg", 
                standardSub2));
        
    //meal plan admin
        ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new MealPlanAdmin("John Doe", 
                "Male", "123458", null, 1234322L, "john@gmail.com", 
                new Community ("Boylston", new City ("Boson")), "1234", "12"));
        
        ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new MealPlanAdmin("Kris Brown", 
                "Feale", "123458", null, 1234322L, "kris@gmail.com", 
                new Community ("Houston", new City ("Boson")), "1234", "11"));
        
    //meal plan    
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().add(new MealPlan(1, "Day Plan", "Vegan", "Salad Bowl, Almond Broccoli Soup with chia seeds, Vegan Cookie, Brown Rice"));
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().add(new MealPlan(2, "Week Plan", "Vegeterian", "Vegetable Curry, Tomato Basil Soup, Indian Naan plain and garlic, Chocolate icecream"));
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().add(new MealPlan(3, "Month Plan", "Non Vegeterian", "Chicken curry with Indian Spices, Sweet corn soup, vanilla cookie cream icecream"));
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().add(new MealPlan(4, "Day Plan", "Vegeterian", "Indian thali with Paneer Tikka Masala, Tandoori Roti, Badaami Kheer"));
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().add(new MealPlan(5, "Week Plan", "Vegan", "Indo Chinese Gralic Noodles, Plain Naan, Mint Raita, Salted Lassi"));
        
        
    // Dormitory system Admin
//     ecoSystem.getLoginDetails().addAdminkeyValue("hinal","0000" );
     
     
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
