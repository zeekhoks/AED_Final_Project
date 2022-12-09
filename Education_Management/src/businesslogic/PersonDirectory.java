/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic;

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
    
    public static void addPerson(Person p) {
        personDirectory.add(p);
    }
    
    public Person authenticateAdmin(String username, String password) {
//        Person user = personDirectory.stream().filter(l -> l.getPersonEmailAddress().equals(username) && l.getUserPassword().equals(password)).findFirst().orElse(null);
//        boolean found = user == null ? false : true;
//        return found;
//        
        if(!getPersonDirectory().isEmpty()) {
            for(Person p : personDirectory) {
                if(p.getPersonEmailAddress().equals(username) && p.getUserPassword().equals(password)) {
                    return p;
                }
            }
        }
        return null;
    }
    
    public String getPersonRole(String username) {
        for(Person p : personDirectory){
            if(p.getPersonEmailAddress().equals(username)){
                return p.getUserRole().toString();
            }
        }
        return null;
    }

    public Person getPersonByEmail(String schoolAdminEmail) {
       for(Person p : personDirectory) {
           if(p.getPersonEmailAddress().equals(schoolAdminEmail)){
               return p;
           }
       }
       return null;
    }

    public void deletePerson(Person p) {
        personDirectory.remove(p);
    }

    public void addNewPerson(Person person) {
        personDirectory.add(person);
    }
    
    
}
