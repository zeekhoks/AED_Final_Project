/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic;

/**
 *
 * @author drashtibhingradiya
 */
public class Community {
    private String community;
    private City city;

    public Community() {
    }

    
    public String getCommunity() {
        return community;
    }

    public Community(String community, City city) {
        this.community = community;
        this.city = city;
    }
    
    public void setCommunity(String communityName) {
        this.community = communityName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
