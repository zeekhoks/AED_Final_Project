/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.helper;

/**
 *
 * @author drashtibhingradiya
 */
public class ValidateInputs {
    
    public static boolean isNameValid(String name){        
        if(name.matches("^[a-zA-Z]+[a-zA-Z0-9\\s]+$")){
            return true;
        }return false;
    }
  
    public static boolean isEmailValid(String email){        
        if(email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            return true;
        }return false;
    }

    public static boolean isPhoneNumberValid(String phoneNo){        
        if(!phoneNo.isEmpty() && phoneNo.matches("^[0-9]+$") && phoneNo.length()==10){
            return true;
        }return false;
    }
    
public static boolean isPasswordValid(String password){
        if(!password.isEmpty() && password.matches("^[a-zA-Z0-9]+$")){  //"^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$"
            return true;
        }return false;
    }
    
}
