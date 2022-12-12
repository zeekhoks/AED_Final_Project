/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.dormitory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Hinal
 */
public class LoginDetails {
    public static Map<String,String> StudentDetails;
    public static Map<String,String> AdminDetails;
    public static Map<String,String> EmployeeDetails;

    
    public LoginDetails(){
        StudentDetails = new HashMap<>();
        AdminDetails = new HashMap<>();
        EmployeeDetails = new HashMap<>();
        AdminDetails.put("hinal", "0000");
    }
//zz    public LoginDetails(String un,String pwd){
//        StudentDetails = new HashMap<>();
//        AdminDetails = new HashMap<>();
//        EmployeeDetails = new HashMap<>();
//        HospitalAdminDetails = new HashMap<>();
//        CommunityAdminDetails = new HashMap<>();
//        AdminDetails.put(un, pwd);
//        
//    }
    public void addkeyValue(String x, String y){
        StudentDetails.put(x, y);
    }
    public void addAdminkeyValue(String x, String y){
        AdminDetails.put(x, y);
    }
    public void addEmployeekeyValue(String x, String y){
        EmployeeDetails.put(x, y);
    }

    public void deleteStudentKeyValue(String s){
        StudentDetails.remove(s);
    }
    public void deleteAdminKeyValue(String s){
        AdminDetails.remove(s);
    }
    public void deleteEmployeeKeyValue(String s){
        EmployeeDetails.remove(s);
    }
    
    public Set<String> keys(){
        Set<String> keyset =StudentDetails.keySet();
        return keyset;
    }
    public Set<String> AdminKeys(){
        Set<String> keyset = AdminDetails.keySet();
        return keyset;
    }
    public Set<String> EmployeeKeys(){
        Set<String> keyset = EmployeeDetails.keySet();
        return keyset;
    }

    public String getValue(String s){
        return StudentDetails.get(s);
    }
    public String getAdminValue(String s){
        return AdminDetails.get(s);
    }
    public String getEmployeeValue(String s){
        return EmployeeDetails.get(s);
    }

}
