/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

import businesslogic.Person;
import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class SchoolAdminDirectory {
    private ArrayList<SchoolAdmin> schoolAdminDirectory;

    public SchoolAdminDirectory() {
        schoolAdminDirectory = new ArrayList<SchoolAdmin>();
    }

    public ArrayList<SchoolAdmin> getSchoolAdminDirectory() {
        return schoolAdminDirectory;
    }

    public void setSchoolAdminDirectory(ArrayList<SchoolAdmin> schoolAdminDir) {
        schoolAdminDirectory = schoolAdminDir;
    }
    
    public String getSchoolCodeByAdminEmail(String email) {
        for(SchoolAdmin sa : schoolAdminDirectory){
            if(sa.getPersonEmailAddress().equals(email) && sa.getUserRole().equals("SCHOOL_ADMIN")) {
                return sa.getSchoolCode();
            }
        }
        return null;
    }
    
    public SchoolAdmin getSchoolAdminByEmail(String schoolAdminEmail) {
       for(SchoolAdmin p : schoolAdminDirectory) {
           if(p.getPersonEmailAddress().equals(schoolAdminEmail)){
               return p;
           }
       }
       return null;
    }

    public SchoolAdmin authenticateAdmin(String userName, String password) {
        
        SchoolAdmin user = schoolAdminDirectory.stream().filter(
                l -> l.getPersonEmailAddress().equals(userName) && 
                        l.getUserPassword().equals(password)).findFirst().orElse(null);
        return user;
        }
        
}
    

