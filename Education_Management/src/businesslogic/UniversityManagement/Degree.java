/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

/**
 *
 * @author zainabkhokawala
 */
public class Degree {
    
    private String degreeLevel;
    private String major;

    public Degree(String degreeLevel, String major) {
        this.degreeLevel = degreeLevel;
        this.major = major;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    
    
}
