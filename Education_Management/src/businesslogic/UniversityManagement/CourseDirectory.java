/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

import java.util.ArrayList;

/**
 *
 * @author zainabkhokawala
 */
public class CourseDirectory {
    
    private ArrayList<Course> courseDirectory;
    
    public CourseDirectory(){
        this.courseDirectory = new ArrayList<>();
        
    }

    public ArrayList<Course> getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(ArrayList<Course> courseDirectory) {
        this.courseDirectory = courseDirectory;
    }
    
    

    
}
