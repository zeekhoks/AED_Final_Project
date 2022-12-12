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
    private ArrayList<PersonU> personDirectory;
    
    public PersonUDirectory(){
        this.personDirectory = new ArrayList<>();
    }

    public ArrayList<PersonU> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<PersonU> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    
    public PersonU authenticateAdmin(String userName, String userPassword){
           if(!getPersonDirectory().isEmpty()) {
            for(PersonU p : personDirectory) {
                if(p.getPersonEmailAddress().equals(userName) && p.getUserPassword().equals(userPassword)) {
                    return p;
                }
            }
        }
        return null;
    }

    
    
    
    
}
