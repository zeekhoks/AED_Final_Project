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
public class AppointmentDirectory {
    
    private ArrayList<PlacementAppointment> appointmentDirectory;
    
    public AppointmentDirectory(){
        this.appointmentDirectory = new ArrayList<>();
        
    }

    public ArrayList<PlacementAppointment> getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(ArrayList<PlacementAppointment> appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
    }


}
