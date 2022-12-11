package businesslogic;


import businesslogic.EcoSystem;
//import businesslogic.school.Student;
import businesslogic.dormitory.LoginDetails;

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
//        Community c = ecoSystem.getCommunityDirectory().addNewCommunity();
//        c.setCommunity("JP");
//        c.setCity(new City("Boston"));
//        
//        ecoSystem.getPersonDirectory().getPersonDirectory().add(new Person(null,null,null, null,
//                null,1234567890,"systemAdmin@gmail.com",c,
//                "1234", Person.UserRole.SYSTEM_ADMIN));
//        
//        ecoSystem.getPersonDirectory().getPersonDirectory().add(new Person(null,null,null, null,
//                null,1234567890,"schoolAdmin@gmail.com",c,
//                "1234", Person.UserRole.SCHOOL_ADMIN));
//        
//        ecoSystem.getStudentDirectory().getStudentDirectory().add(new Student("Yesha", "Patel", "Female", "s01", 
//                "2000-01-01", 1234567890, "yesha@gmail.com", c, "1234", Person.UserRole.STUDENT, 
//                "school01", "Music", 8, "/icons/default.jpg"));
            ecoSystem.getLoginDetails().addAdminkeyValue("hinal","0000" );
            
//         ś ecoSystem.getLoginDetails().getLoginDetails().add(new LoginDetails("hinal","0000"));

        
        return ecoSystem;
    }
}
