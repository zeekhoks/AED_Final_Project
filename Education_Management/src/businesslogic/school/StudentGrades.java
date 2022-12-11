/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

import java.util.Hashtable;

/**
 *
 * @author drashtibhingradiya
 */
public class StudentGrades {
    Hashtable<Integer, Double> grades = new Hashtable<Integer, Double>();

    public Hashtable<Integer, Double> getGrades() {
        return grades;
    }

    public void setSubjects(int subjectId) {
        grades.put(subjectId, Double.NaN);
    }
    
    public void setGrades(int subjectId, double grade) {
        grades.put(subjectId, grade);
    }
    
    public boolean isSubjectAssigned(int subjectID) {
        return grades.containsKey(subjectID);
    }
    
}
