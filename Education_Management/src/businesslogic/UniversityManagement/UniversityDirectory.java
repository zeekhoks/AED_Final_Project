/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

import businesslogic.school.School;
import java.util.ArrayList;

/**
 *
 * @author zainabkhokawala
 */
public class UniversityDirectory {
      private ArrayList<University> universityDirectory;
    
    public UniversityDirectory(){
        this.universityDirectory = new ArrayList<>();
        
    }

    public ArrayList<University> getUniversityDirectory() {
        return universityDirectory;
    }

    public void setUniversityDirectory(ArrayList<University> universityDirectory) {
        this.universityDirectory = universityDirectory;
    }

    public University getUniversityByCode(String universityCode) {
        for(University s : universityDirectory) {
            if(s.getUniversityID().equals(universityCode)){
                return s;
            }
        }
        return null;
    }

    public void deleteUniversity(University s) {
        universityDirectory.remove(s);
    }

    public University addNewUniversity(University university) {
        universityDirectory.add(university);
        return university;
    }
    
}
