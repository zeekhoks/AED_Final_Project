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
public class FeesPaymentHistory {
    
    public static ArrayList<FeesPayment> history=new ArrayList<FeesPayment>();
    
    public FeesPaymentHistory(){
        
    }

    public ArrayList<FeesPayment> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<FeesPayment> history) {
        this.history = history;
    }
    
    public FeesPayment addNewFeesPayment(){
        FeesPayment newFeesPayment = new FeesPayment();
        history.add(newFeesPayment);
        return newFeesPayment;
    }
    public void deleteFeesPayment(FeesPayment dfp){
        history.remove(dfp);
    }

    
    
}
