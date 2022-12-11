/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic;

import businesslogic.EcoSystem;
import businesslogic.MealManagement.MealPlanAdmin;
import businesslogic.UniversityManagement.AppointmentDirectory;
import businesslogic.UniversityManagement.CourseAssignmentDirectory;
import businesslogic.UniversityManagement.CourseDirectory;
import businesslogic.UniversityManagement.Degree;
import businesslogic.UniversityManagement.Professor;
import businesslogic.UniversityManagement.ProfessorDirectory;
import businesslogic.UniversityManagement.Student;
import businesslogic.UniversityManagement.StudentDirectory;
import businesslogic.UniversityManagement.UniversityAdmin;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zainabkhokawala
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem ecoSystem = EcoSystem.getInstance();

        
        
        

        ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new UniversityAdmin("Zainab",
                "Female", "123456", null, 12345677L,
                "zk@gmail.com", 
                new Community("Park Drive", new City("Boston")), "zk123", "U01"));

        ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new Student("Hinal", "Female",
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
