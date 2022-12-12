/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic;

import businesslogic.school.Student;
import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class CommunityDirectory {
        private ArrayList<Community> communityDirectory;

    public void deleteCommunity(Community c) {
        communityDirectory.remove(c);
    }
    
    public CommunityDirectory() {
        communityDirectory = new ArrayList<Community>();
    }
    
    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDir) {
        communityDirectory = communityDir;
    }
    
    public Community addNewCommunity() {
        Community c = new Community();
        communityDirectory.add(c);
        return c;
    }
    
    public Community addCommunity(String com, City city) {
        Community c = new Community();
        c.setCity(city);
        c.setCommunity(com);
        communityDirectory.add(c);
        return c;
    }
    
    public Community getCommunityByName(String community) {
        for(Community c : communityDirectory) {
            if(c.getCommunity().equals(community)){
                return c;
            }
        }
        return null;
    }
}

