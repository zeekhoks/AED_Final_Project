/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class PersonDirectory {
    private static ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
        personDirectory = new ArrayList<Person>();
    }

    public static ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public static void setPersonDirectory(ArrayList<Person> personDirectory) {
        PersonDirectory.personDirectory = personDirectory;
    }
    
    
}
