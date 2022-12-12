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
public class CityDirectory {

    private ArrayList<City> cityDirectory;
    
    public CityDirectory() {
        cityDirectory = new ArrayList<City>();
    }

    public ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public void setCityDirectory(ArrayList<City> cityDir) {
        cityDirectory = cityDir;
    }

    public void addCity(City city) {
        cityDirectory.add(city);
    }

}
