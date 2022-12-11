/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.dormitory;

/**
 *
 * @author Hinal
 */
public class FeesPayment {
    
    private String paymentmonth;
    private double feesamount;
    private String date;
    private String UserName;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPaymentMonth() {
        return paymentmonth;
    }

    public void setPaymentMonth(String paymentmonth) {
        this.paymentmonth = paymentmonth;
    }

    public double getFeesAmount() {
        return feesamount;
    }

    public void setFeesAmount(double feesamount) {
        this.feesamount = feesamount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override 
    public String toString(){
        return date;
    }
    
}
