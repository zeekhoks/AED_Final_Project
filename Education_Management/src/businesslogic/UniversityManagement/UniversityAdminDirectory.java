/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

import businesslogic.school.SchoolAdmin;
import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class UniversityAdminDirectory {
    private ArrayList<UniversityAdmin> universityAdminDirectory;

    public UniversityAdminDirectory() {
        universityAdminDirectory = new ArrayList<UniversityAdmin>();
    }

    public ArrayList<UniversityAdmin> getUniversityAdminDirectory() {
        return universityAdminDirectory;
    }

    public void setUniversityAdminDirectory(ArrayList<UniversityAdmin> universityAdminDir) {
        universityAdminDirectory = universityAdminDir;
    }

    public UniversityAdmin getUniversityAdminByEmail(String universityAdminEmail) {
        for(UniversityAdmin p : universityAdminDirectory) {
           if(p.getPersonEmailAddress().equals(universityAdminEmail)){
               return p;
           }
       }
       return null;
    }
    
    public UniversityAdmin authenticateAdmin(String userName, String password) {
        
        UniversityAdmin user = universityAdminDirectory.stream().filter(
                l -> l.getPersonEmailAddress().equals(userName) && 
                        l.getUserPassword().equals(password)).findFirst().orElse(null);
        return user;
        }
}
