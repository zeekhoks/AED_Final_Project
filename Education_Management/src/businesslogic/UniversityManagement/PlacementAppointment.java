/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.UniversityManagement;

import java.util.Date;

/**
 *
 * @author zainabkhokawala
 */
public class PlacementAppointment {
    
    private long appointmentID;
    private Date appointmentDate;
    private String appointmentTime;
    private String studentFirstName;
    private String studentLastName;
    private String coordinatorFirstName;
    private String coordinatorLastName;
    private String city;
    private String studentInterest;
    private String jobs;
    private String major;

    public PlacementAppointment(long appointmentID, Date appointmentDate, String appointmentTime, String studentFirstName, String studentLastName, String coordinatorFirstName, String coordinatorLastName, String city, String studentInterest, String jobs, String major) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.coordinatorFirstName = coordinatorFirstName;
        this.coordinatorLastName = coordinatorLastName;
        this.city = city;
        this.studentInterest = studentInterest;
        this.jobs = jobs;
        this.major = major;
    }

    public long getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(long appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getCoordinatorFirstName() {
        return coordinatorFirstName;
    }

    public void setCoordinatorFirstName(String coordinatorFirstName) {
        this.coordinatorFirstName = coordinatorFirstName;
    }

    public String getCoordinatorLastName() {
        return coordinatorLastName;
    }

    public void setCoordinatorLastName(String coordinatorLastName) {
        this.coordinatorLastName = coordinatorLastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStudentInterest() {
        return studentInterest;
    }

    public void setStudentInterest(String studentInterest) {
        this.studentInterest = studentInterest;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    

    
}
