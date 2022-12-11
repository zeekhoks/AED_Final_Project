/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.dormitory;

import businesslogic.dormitory.FeesPayment;
import businesslogic.dormitory.FeesPaymentHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author Hinal
 */
public class PayStudFees extends javax.swing.JPanel {

    /**
     * Creates new form PayStudFees
     */
    FeesPaymentHistory history;
    public PayStudFees(FeesPaymentHistory history) {
        initComponents();
        this.history = history;
        
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
        btnPayment = new javax.swing.JButton();
        txtPaymentMonth = new javax.swing.JTextField();
        txtFeesAmount = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblCreateSigns = new javax.swing.JLabel();
        lblTemparature = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));

        lblBloodPressure.setText("Fees Amount:");

        lblDate.setText("Date:");

        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
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

        txtFeesAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeesAmountActionPerformed(evt);
            }
        });
        txtFeesAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFeesAmountKeyPressed(evt);
            }
        });

        lblCreateSigns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreateSigns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateSigns.setText("Dorm Fees Details");

        lblTemparature.setText("Payment Month:");

        jLabel1.setText("Student Username:");

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
                    .addComponent(btnPayment)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFeesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtFeesAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(36, 36, 36)
                .addComponent(btnPayment)
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
        String PaymentMonth = txtPaymentMonth.getText();
        double FeesAmount = Double.parseDouble(txtFeesAmount.getText());
        String Date = txtDate.getText();
        String UserName = txtUserName.getText();
        
        FeesPayment fp = history.addNewFeesPayment();
        System.out.println(history.getHistory().size());
        fp.setPaymentMonth(PaymentMonth);
        fp.setFeesAmount(FeesAmount);
        fp.setDate(Date);
        fp.setUserName(UserName);
        
       JOptionPane.showMessageDialog(this, "Fees Deatils are Saved");
       
       txtPaymentMonth.setText("");
       txtFeesAmount.setText("");
       txtDate.setText("");
       txtUserName.setText("");
        
        
        
        
   
    }//GEN-LAST:event_btnPaymentActionPerformed

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

    private void txtFeesAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFeesAmountKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
	if (c== '.' || Character.isDigit(c))
    {
        txtFeesAmount.setEditable(true);
    }
    else
    {
        txtFeesAmount.setEditable(false);
        JOptionPane.showMessageDialog(this, "not allowed to enter words");
}
    }//GEN-LAST:event_txtFeesAmountKeyPressed

    private void txtPaymentMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentMonthActionPerformed

    private void txtFeesAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeesAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeesAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCreateSigns;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTemparature;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFeesAmount;
    private javax.swing.JTextField txtPaymentMonth;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
