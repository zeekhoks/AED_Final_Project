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
public class PersonUDirectory {
    private ArrayList<PersonU> personUDirectory;
    
    public PersonUDirectory(){
        this.personUDirectory = new ArrayList<>();
    }

    public ArrayList<PersonU> getPersonDirectory() {
        return personUDirectory;
    }

    public void setPersonDirectory(ArrayList<PersonU> personDirectory) {
        this.personUDirectory = personDirectory;
    }

    public PersonU getPersonByEmail(String universityAdminEmail) {
        for(PersonU p : personUDirectory) {
           if(p.getPersonEmailAddress().equals(universityAdminEmail)){
               return p;
           }
       }
       return null;
    }

    public void deletePerson(PersonU p) {
        personUDirectory.remove(p);
    }

    
}
