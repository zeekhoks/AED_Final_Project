/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.dormitory;

import businesslogic.dormitory.RoomBooking;
import businesslogic.dormitory.RoomBookingHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static businesslogic.dormitory.RoomBookingHistory.historyroom;

/**
 *
 * @author Hinal
 */
public class ViewRoomDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewFeesDetails
     */
    
    RoomBookingHistory historyroom;
    public ViewRoomDetails(RoomBookingHistory historyroom) {
        initComponents();
        this.historyroom = historyroom;
        System.out.println(historyroom.getHistoryroom().size());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateSigns = new javax.swing.JLabel();
        lblTemparature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtRoomActive = new javax.swing.JTextField();
        txtRoomNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoomDetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        lblCreateSigns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreateSigns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateSigns.setText("Room Details");

        lblTemparature.setText("Room Number:");

        lblBloodPressure.setText("Room Active(Y/N):");

        txtRoomActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomActiveActionPerformed(evt);
            }
        });

        txtRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNumberActionPerformed(evt);
            }
        });

        tblRoomDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Room Number", "Room Active"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRoomDetails);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRoomActive, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTemparature, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(lblTemparature))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtRoomActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int SelectedIndexRow = tblRoomDetails.getSelectedRow();
        
        if(SelectedIndexRow<0){
            JOptionPane.showMessageDialog(this, "Please select row to Delete");
            return;
        }
        DefaultTableModel table = (DefaultTableModel) tblRoomDetails.getModel();
        RoomBooking Selectedroom = (RoomBooking) table.getValueAt(SelectedIndexRow, 0);
        
        historyroom.deleteRoom(Selectedroom);
        
        populateTable();
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int SelectedIndexRow = tblRoomDetails.getSelectedRow();
        
        if(SelectedIndexRow<0){
            JOptionPane.showMessageDialog(this, "Please select row to View");
            return;
        }
        DefaultTableModel table = (DefaultTableModel) tblRoomDetails.getModel();
        RoomBooking Selectedroom = (RoomBooking) table.getValueAt(SelectedIndexRow, 0);
        
        txtRoomNumber.setText(String.valueOf(Selectedroom.getRoomNumber()));
        txtRoomActive.setText(String.valueOf(Selectedroom.getRoomActive()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNumberActionPerformed

    private void txtRoomActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomActiveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCreateSigns;
    private javax.swing.JLabel lblTemparature;
    private javax.swing.JTable tblRoomDetails;
    private javax.swing.JTextField txtRoomActive;
    private javax.swing.JTextField txtRoomNumber;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        System.out.println();
        
        DefaultTableModel table = (DefaultTableModel) tblRoomDetails.getModel();
        table.setRowCount(0);
        System.out.println(historyroom.getHistoryroom().size());
        
        for(RoomBooking vs: historyroom.getHistoryroom()){
                Object[] row = new Object[2];
                row[0] = vs;
                row[1] = vs.getRoomActive();
                //row[2] = vs.getRoomActive();
            
                table.addRow(row);
                
        }
    }

}
