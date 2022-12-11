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
public class TeacherDirectory {
    private static ArrayList<Teacher> teacherDirectory;

    public TeacherDirectory() {
        teacherDirectory = new ArrayList<Teacher>();
    }
    
    public static ArrayList<Teacher> getTeacherDirectory() {
        return teacherDirectory;
    }

    public static void setTeacherDirectory(ArrayList<Teacher> teacherDirectory) {
        TeacherDirectory.teacherDirectory = teacherDirectory;
    }
    
    public static Teacher getTeacherByID(String id) {
        for(Teacher s : teacherDirectory) {
            if(s.getPersonId().equals(id)){
                return s;
            }
        }
        return null;
    }
    
    public static Teacher addNewTeacher(Teacher s){
        teacherDirectory.add(s);
        return s;
    }
    
    public void deleteTeacher(Teacher s) {
        teacherDirectory.remove(s);
    }

    public Person authenticateTeacher(String userName, String password) {
        Teacher user = teacherDirectory.stream().filter(
                l -> l.getPersonEmailAddress().equals(userName) && 
                    l.getUserPassword().equals(password)).findFirst().orElse(null);
        return user;    
    }

    public String getTeacherIDByName(String name) {
        for(Teacher t : teacherDirectory) {
            if(t.getPersonFirstName().equals(name)) {
                return t.getPersonId();
            }
        }
        return null;
    }
    
    public String getTeacherNameByID(String id) {
        for(Teacher t : teacherDirectory) {
            if(t.getPersonId().equals(id)) {
                return t.getPersonFirstName();
            }
        }
        return null;
    }

    public Teacher getTeacherByName(String teacherName) {
        for(Teacher t : teacherDirectory) {
            if(t.getPersonFirstName().equals(teacherName)) {
                return t;
            }
        }
        return null;
    }
    
}
