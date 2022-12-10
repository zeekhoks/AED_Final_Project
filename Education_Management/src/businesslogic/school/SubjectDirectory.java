/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class SubjectDirectory {
    private static ArrayList<Subject> subjectDirectory;
    
    public SubjectDirectory() {
        subjectDirectory = new ArrayList<Subject>();
    }

    public static ArrayList<Subject> getSubjectDirectory() {
        return subjectDirectory;
    }

    public static void setSubjectDirectory(ArrayList<Subject> subjectDirectory) {
        SubjectDirectory.subjectDirectory = subjectDirectory;
    }

    public Subject addNewSubject(Subject subject) {
        subjectDirectory.add(subject);
        return subject;
    }
    
    public int getSubjectIDByName(String subjectName) {
        for(Subject s : subjectDirectory) {
            if(s.getSubjectName().equals(subjectName)) {
                return s.getSubjectID();
            }
        }
        return 0;
    }
    
    public String getSubjectNameByID(int id) {
        for(Subject s : subjectDirectory) {
            if(s.getSubjectID() == id) {
                return s.getSubjectName();
            }
        }
        return null;
    }
    
    public String getTeacherNameByID(int id) {
        for(Subject s : subjectDirectory) {
            if(s.getSubjectID() == id) {
                return s.getTeacherName();
            }
        }
        return null;
    }

    public Subject getSubjectByID(int subjectID) {
        for(Subject s : subjectDirectory) {
            if(s.getSubjectID() == subjectID) {
                return s;
            }
        }
        return null;
    }

    public void deleteSubject(Subject s) {
        subjectDirectory.remove(s);
    }
}
