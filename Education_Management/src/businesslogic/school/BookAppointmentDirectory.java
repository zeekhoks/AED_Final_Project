/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

import java.util.ArrayList;

/**
 *
 * @author drashtibhingradiya
 */
public class BookAppointmentDirectory {
    private static ArrayList<BookAppointment> bookAppointmentDirectory;
    
    public BookAppointmentDirectory() {
        bookAppointmentDirectory = new ArrayList<BookAppointment>();
    }

    public static ArrayList<BookAppointment> getBookAppointmentDirectory() {
        return bookAppointmentDirectory;
    }

    public static void setBookAppointmentDirectory(ArrayList<BookAppointment> bookAppointmentDirectory) {
        BookAppointmentDirectory.bookAppointmentDirectory = bookAppointmentDirectory;
    }
    
    public BookAppointment addNewAppointment(BookAppointment ba) {
        bookAppointmentDirectory.add(ba);
        return ba;
    }

    public BookAppointment getAppointmentbyStudentID(String studentID) {
        for(BookAppointment ba : bookAppointmentDirectory) {
            if(ba.getStudentID().equals(studentID)) {
                return ba;
            }
        }
        return null;
    }

    public void deleteAppointment(BookAppointment ba) {
        bookAppointmentDirectory.remove(ba);
    }
    
}
