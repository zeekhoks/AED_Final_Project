/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.dormitory;

import businesslogic.dormitory.SalaryPayment;
import businesslogic.dormitory.SalaryPaymentHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Hinal
 */
public class PayEmpSalary extends javax.swing.JPanel {

    /**
     * Creates new form PayStudFees
     */
    SalaryPaymentHistory historysal;
    public PayEmpSalary(SalaryPaymentHistory historysal) {
        initComponents();
        this.historysal = historysal;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBloodPressure = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnPaymentSal = new javax.swing.JButton();
        txtPaymentMonth = new javax.swing.JTextField();
        txtSalaryAmount = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblCreateSigns = new javax.swing.JLabel();
        lblTemparature = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));

        lblBloodPressure.setText("Salary Amount:");

        lblDate.setText("Date:");

        btnPaymentSal.setText("Payment");
        btnPaymentSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentSalActionPerformed(evt);
            }
        });

        txtPaymentMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentMonthActionPerformed(evt);
            }
        });
        txtPaymentMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaymentMonthKeyPressed(evt);
            }
        });

        txtSalaryAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryAmountActionPerformed(evt);
            }
        });
        txtSalaryAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalaryAmountKeyPressed(evt);
            }
        });

        lblCreateSigns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreateSigns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateSigns.setText("Salary Details");

        lblTemparature.setText("Payment Month:");

        jLabel1.setText("Employee Username:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBloodPressure)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel1)
                    .addComponent(lblTemparature))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPaymentSal)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSalaryAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPaymentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtUserName)
                            .addGap(3, 3, 3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemparature)
                    .addComponent(txtPaymentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtSalaryAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(36, 36, 36)
                .addComponent(btnPaymentSal)
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaymentSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentSalActionPerformed
        // TODO add your handling code here:
        String PaymentMonth = txtPaymentMonth.getText();
        double SalaryAmount = Double.parseDouble(txtSalaryAmount.getText());
        String Date = txtDate.getText();
        String UserName = txtUserName.getText();
        
        SalaryPayment sp = historysal.addNewSalaryPayment();
        System.out.println(historysal.getHistorysal().size());
        sp.setPaymentMonth(PaymentMonth);
        sp.setSalaryAmount(SalaryAmount);
        sp.setDate(Date);
        sp.setUserName(UserName);
        
       JOptionPane.showMessageDialog(this, "Salary Deatils are Saved");
       
       txtPaymentMonth.setText("");
       txtSalaryAmount.setText("");
       //txtPulse.setText("");
       txtDate.setText("");
       txtUserName.setText("");
        
        
        
        
   
    }//GEN-LAST:event_btnPaymentSalActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
	if(Character.isLetter(c)|| Character.isISOControl(c))
    {
        txtUserName.setEditable(true);
    }
    else
    {
        txtUserName.setEditable(false);
        JOptionPane.showMessageDialog(this, "Invalid Input \nenter valid username");
    }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtPaymentMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaymentMonthKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
    if(Character.isISOControl(c)||Character.isWhitespace(c))
        {
            if (c== '.' || Character.isLetterOrDigit(c))
            {
                txtPaymentMonth.setEditable(true);
            }
            else
            {
                txtPaymentMonth.setEditable(false);
                JOptionPane.showMessageDialog(this, "not allowed to enter words");
            }
        }
    }//GEN-LAST:event_txtPaymentMonthKeyPressed

    private void txtSalaryAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryAmountKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
	if (c== '.' || Character.isDigit(c))
    {
        txtSalaryAmount.setEditable(true);
    }
    else
    {
        txtSalaryAmount.setEditable(false);
        JOptionPane.showMessageDialog(this, "not allowed to enter words");
}
    }//GEN-LAST:event_txtSalaryAmountKeyPressed

    private void txtPaymentMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentMonthActionPerformed

    private void txtSalaryAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPaymentSal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCreateSigns;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTemparature;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPaymentMonth;
    private javax.swing.JTextField txtSalaryAmount;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
