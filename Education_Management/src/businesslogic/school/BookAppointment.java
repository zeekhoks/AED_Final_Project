/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.school;

/**
 *
 * @author drashtibhingradiya
 */
public class BookAppointment {
    private String studentID;
    private String date;
    private String teacherID;
    private String topic;

    public BookAppointment(String studentID, String date, String teacherID, String topic) {
        this.studentID = studentID;
        this.date = date;
        this.teacherID = teacherID;
        this.topic = topic;
    }
    
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    @Override
    public String toString(){
        return date.toString();
    }
}
