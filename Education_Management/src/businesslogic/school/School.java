/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package businesslogic.school;
import businesslogic.Community;

/**
 *
 * @author drashtibhingradiya
 */
public class School {
//    private String schoolID;
    private String schoolName;
    private String schoolCode;
    private Community community;
    private long phoneNo;
    private String schoolAdminEmail;
    private String schoolAdminPassword;

    public School(String schoolName, String schoolCode, Community community, long mobileNo, String schoolAdminEmail, String schoolAdminPassword) {
//        this.schoolID = schoolID;
        this.schoolName = schoolName;
        this.schoolCode = schoolCode;
        this.community = community;
        this.phoneNo = mobileNo;
        this.schoolAdminEmail = schoolAdminEmail;
        this.schoolAdminPassword = schoolAdminPassword;
    }
    
//    public String getSchoolID() {
//        return schoolID;
//    }
//
//    public void setSchoolID(String schoolID) {
//        this.schoolID = schoolID;
//    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolcode) {
        this.schoolCode = schoolcode;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long mobileNo) {
        this.phoneNo = mobileNo;
    }

    public String getSchoolAdminEmail() {
        return schoolAdminEmail;
    }

    public void setSchoolAdminEmail(String schoolAdminEmail) {
        this.schoolAdminEmail = schoolAdminEmail;
    }

    public String getSchoolAdminPassword() {
        return schoolAdminPassword;
    }

    public void setSchoolAdminPassword(String schoolAdminPassword) {
        this.schoolAdminPassword = schoolAdminPassword;
    }
    
    @Override
    public String toString(){
        return schoolCode;
    }
    
}
