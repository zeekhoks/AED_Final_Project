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

    private static ArrayList<City> cityDirectory;
    
    public CityDirectory() {
        cityDirectory = new ArrayList<City>();
    }

    public static ArrayList<City> getCityDirectory() {
        return cityDirectory;
    }

    public static void setCityDirectory(ArrayList<City> cityDirectory) {
        CityDirectory.cityDirectory = cityDirectory;
    }

    public static void addCity(City city) {
        cityDirectory.add(city);
    }

}
