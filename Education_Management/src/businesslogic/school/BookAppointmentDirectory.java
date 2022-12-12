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

    private ArrayList<BookAppointment> bookAppointmentDirectory;

    public BookAppointmentDirectory() {
        bookAppointmentDirectory = new ArrayList<BookAppointment>();
    }

    public ArrayList<BookAppointment> getBookAppointmentDirectory() {
        return bookAppointmentDirectory;
    }

    public void setBookAppointmentDirectory(ArrayList<BookAppointment> bookAppointmentDir) {
        bookAppointmentDirectory = bookAppointmentDir;
    }

    public BookAppointment addNewAppointment(BookAppointment ba) {
        bookAppointmentDirectory.add(ba);
        return ba;
    }

    public BookAppointment getAppointmentbyStudentID(String studentID) {
        for (BookAppointment ba : bookAppointmentDirectory) {
            if (ba.getStudentID().equals(studentID)) {
                return ba;
            }
        }
        return null;
    }

    public void deleteAppointment(BookAppointment ba) {
        bookAppointmentDirectory.remove(ba);
    }

}
