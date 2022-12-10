/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic;

import businesslogic.UniversityManagement.AppointmentDirectory;
import businesslogic.UniversityManagement.CourseAssignmentDirectory;
import businesslogic.UniversityManagement.CourseDirectory;
import businesslogic.UniversityManagement.Degree;
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
                "Female", "123456", new Date(1997, 07, 26), 12345677L,
                "zk@gmail.com", new Community("Park Drive", new City("Boston")), "zk123"));

        ecoSystem.getPersonDirectoryRef().getPersonDirectory().add(new Student("Hinal", "Female",
                "123457", new Date(1997, 11, 21), 12345687L, "hp@gmail.com", new Community("Westland Avenue",
                        new City("Boston")), "hp123", "12", new Degree("Graduate", "Information Systems"),
                "2024", "photo"));

        
        return ecoSystem;

    }

}
