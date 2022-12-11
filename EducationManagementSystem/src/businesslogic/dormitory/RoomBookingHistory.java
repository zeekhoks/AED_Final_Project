/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.dormitory;

import java.util.ArrayList;

/**
 *
 * @author Hinal
 */
public class RoomBookingHistory {
    
    public static ArrayList<RoomBooking> historyroom = new ArrayList<RoomBooking>();
    
    public RoomBookingHistory(){
        
    }

    public ArrayList<RoomBooking> getHistoryroom() {
        return historyroom;
    }

    public void setHistoryroom(ArrayList<RoomBooking> historyroom) {
        this.historyroom = historyroom;
    }
    
    public RoomBooking addNewRoom(){
        RoomBooking newRoom = new RoomBooking();
        historyroom.add(newRoom);
        return newRoom;
    }
    public void deleteRoom(RoomBooking dr){
        historyroom.remove(dr);
    }
    
}
