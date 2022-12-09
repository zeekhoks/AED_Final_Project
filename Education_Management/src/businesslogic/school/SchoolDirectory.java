/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic.school;

import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class SchoolDirectory {

    private static ArrayList<School> schoolDirectory;
    
    public SchoolDirectory(){
        schoolDirectory = new ArrayList<School>();
    }

    public static ArrayList<School> getSchoolDirectory() {
        return schoolDirectory;
    }

    public static void setSchoolDirectory(ArrayList<School> schoolDirectory) {
        SchoolDirectory.schoolDirectory = schoolDirectory;
    }

    public School getSchoolByCode(String schoolCode) {
        for(School s : schoolDirectory) {
            if(s.getSchoolCode().equals(schoolCode)){
                return s;
            }
        }
        return null;
    }

    public void deleteSchool(School s) {
        schoolDirectory.remove(s);
    }
    
    public static School addNewSchool(School s){
        schoolDirectory.add(s);
        return s;
    }
    
}
