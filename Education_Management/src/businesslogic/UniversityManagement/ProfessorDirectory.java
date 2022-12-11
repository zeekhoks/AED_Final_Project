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
public class ProfessorDirectory {
    
      private ArrayList<Professor> professorDirectory;
     
    public ProfessorDirectory(){
        this.professorDirectory = new ArrayList<>();
        
    }

    public ArrayList<Professor> getProfessorDirectory() {
        return professorDirectory;
    }

    public void setProfessorDirectory(ArrayList<Professor> professorDirectory) {
        this.professorDirectory = professorDirectory;
    }

  

    
}
