/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.dormitory;

/**
 *
 * @author Hinal
 */
public class RoomBooking {
    
    private String roomnumber;
    private String  roomactive;

    public String getRoomNumber() {
        return roomnumber;
    }

    public void setRoomNumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getRoomActive() {
        return roomactive;
    }

    public void setRoomActive(String roomactive) {
        this.roomactive = roomactive;
    }
    
     @Override 
    public String toString(){
        return roomnumber;
    }
  
}
