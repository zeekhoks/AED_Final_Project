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
public class SalaryPaymentHistory {
    
    public static ArrayList<SalaryPayment> historysal=new ArrayList<SalaryPayment>();
    
    public SalaryPaymentHistory(){
        
    }

    public ArrayList<SalaryPayment> getHistorysal() {
        return historysal;
    }

    public void setHistorysal(ArrayList<SalaryPayment> historysal) {
        this.historysal = historysal;
    }
    
    public SalaryPayment addNewSalaryPayment(){
        SalaryPayment newSalaryPayment = new SalaryPayment();
        historysal.add(newSalaryPayment);
        return newSalaryPayment;
    }
    public void deleteSalaryPayment(SalaryPayment dsp){
        historysal.remove(dsp);
    }

    
    
}
