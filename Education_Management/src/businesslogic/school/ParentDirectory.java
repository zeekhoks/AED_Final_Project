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
public class ParentDirectory {
    private static ArrayList<Parent> parentDirectory;
    
    public ParentDirectory(){
        parentDirectory = new ArrayList<Parent>();
    }

    public static ArrayList<Parent> getParentDirectory() {
        return parentDirectory;
    }

    public static void setParentDirectory(ArrayList<Parent> parentDirectory) {
        ParentDirectory.parentDirectory = parentDirectory;
    }
    
}
