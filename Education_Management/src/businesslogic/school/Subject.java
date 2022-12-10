/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

import java.util.List;

/**
 *
 * @author drashtibhingradiya
 */
public class Subject {
    private int subjectID;
    private String subjectName;
    private int standard;
    private String teacherName;

    public Subject(int subjectID, String subjectName, int standard, String teacherName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.standard = standard;
        this.teacherName = teacherName;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    @Override
    public String toString(){
        return String.valueOf(subjectID);
    }
    
}
