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

    private ArrayList<School> schoolDirectory;
    
    public SchoolDirectory(){
        schoolDirectory = new ArrayList<School>();
    }

    public ArrayList<School> getSchoolDirectory() {
        return schoolDirectory;
    }

    public void setSchoolDirectory(ArrayList<School> schoolDir) {
        schoolDirectory = schoolDir;
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
    
    public School addNewSchool(School s){
        schoolDirectory.add(s);
        return s;
    }
    
}
