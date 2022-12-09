/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class Event {
    
    private String semester;
    private String eventName;
    private String eventDescription;
    private String eventGuest;
    private Date eventDate;
    private LocalTime eventTime;
    private Boolean eventAttendance;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalTime eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventGuest() {
        return eventGuest;
    }

    public void setEventGuest(String eventGuest) {
        this.eventGuest = eventGuest;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Boolean getEventAttendance() {
        return eventAttendance;
    }

    public void setEventAttendance(Boolean eventAttendance) {
        this.eventAttendance = eventAttendance;
    }
    
    
    
}
