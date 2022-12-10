/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.school.TeacherRole;

import businesslogic.EcoSystem;
import businesslogic.school.BookAppointment;
import businesslogic.school.Student;
import businesslogic.school.Subject;
import businesslogic.school.Teacher;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import ui.MainJFrame;
import ui.school.SchoolAdminRole.SchoolAdminDashboardJPanel;

/**
 *
 * @author drashtibhingradiya
 */
public class TeacherDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherDashboardJPanel
     */
    private EcoSystem ecoSystem;
    private Teacher userLogged; 
    
    public TeacherDashboardJPanel(EcoSystem ecoSystem, Teacher userLogged) {
        initComponents();
        setSize(1060, 770);
        this.ecoSystem = ecoSystem;
        this.userLogged = userLogged;
        
        workAreaPanel.setVisible(true);
        gradeStudentPanel.setVisible(false); 
        appointmentsPanel.setVisible(false);
        
        for(Subject s : ecoSystem.getSubjectDirectory().getSubjectDirectory()) {
            if(s.getTeacherName().equals(userLogged.getPersonFirstName())) {
                dropDownSubject.addItem(s.getSubjectName());
            }
        }
        
        populateGradesTable();
        populateAppointmentTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlArea = new javax.swing.JPanel();
        btnGradeStudent = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        workAreaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        appointmentsPanel = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnGradesBack1 = new javax.swing.JButton();
        appointmetsWorkAreaPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnViewAppointment = new javax.swing.JButton();
        btnDeleteAppointment = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jBookDate = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTopic = new javax.swing.JTextArea();
        txtAppointmentStudent = new javax.swing.JTextField();
        btnUpdateAppointment = new javax.swing.JButton();
        gradeStudentPanel = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnGradesBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        dropDownStudent = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGrade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrade = new javax.swing.JTable();
        dropDownSubject = new javax.swing.JComboBox<>();

        btnGradeStudent.setText("Grade Students");
        btnGradeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeStudentActionPerformed(evt);
            }
        });

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jButton2.setText("Appointments");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlAreaLayout = new javax.swing.GroupLayout(controlArea);
        controlArea.setLayout(controlAreaLayout);
        controlAreaLayout.setHorizontalGroup(
            controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlAreaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnLogOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(controlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGradeStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
        );
        controlAreaLayout.setVerticalGroup(
            controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlAreaLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(btnGradeStudent)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(226, 226, 226))
        );

        jSplitPane1.setLeftComponent(controlArea);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        workAreaPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("teacher details");
        workAreaPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/blue.jpeg"))); // NOI18N
        workAreaPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 840));

        jLayeredPane1.add(workAreaPanel, "card2");

        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Manage Appointments");

        btnGradesBack1.setText("Back");
        btnGradesBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradesBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnGradesBack1)
                .addGap(269, 269, 269)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGradesBack1)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jSplitPane3.setTopComponent(jPanel3);

        appointmetsWorkAreaPanel.setBackground(new java.awt.Color(37, 150, 190));

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Student", "Topic"
            }
        ));
        jScrollPane2.setViewportView(tblAppointment);

        jLabel8.setText("Scheduled Appoinments");

        btnViewAppointment.setText("View Appointment");
        btnViewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentActionPerformed(evt);
            }
        });

        btnDeleteAppointment.setText("Delete Appointment");
        btnDeleteAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAppointmentActionPerformed(evt);
            }
        });

        jLabel13.setText("Date:");

        jLabel16.setText("Student:");

        jLabel17.setText("Consulting topic:");

        txtTopic.setColumns(20);
        txtTopic.setRows(5);
        jScrollPane3.setViewportView(txtTopic);

        btnUpdateAppointment.setText("Reschedule Appointment");
        btnUpdateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appointmetsWorkAreaPanelLayout = new javax.swing.GroupLayout(appointmetsWorkAreaPanel);
        appointmetsWorkAreaPanel.setLayout(appointmetsWorkAreaPanelLayout);
        appointmetsWorkAreaPanelLayout.setHorizontalGroup(
            appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                            .addGap(371, 371, 371)
                            .addComponent(jLabel8))
                        .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                            .addGap(312, 312, 312)
                            .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAppointmentStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                            .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                                    .addGap(312, 312, 312)
                                    .addComponent(jLabel13))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appointmetsWorkAreaPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnViewAppointment)
                                    .addGap(11, 11, 11)))
                            .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addComponent(btnUpdateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDeleteAppointment))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appointmetsWorkAreaPanelLayout.createSequentialGroup()
                                    .addComponent(jBookDate, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70))))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        appointmetsWorkAreaPanelLayout.setVerticalGroup(
            appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmetsWorkAreaPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewAppointment)
                    .addComponent(btnDeleteAppointment)
                    .addComponent(btnUpdateAppointment))
                .addGap(42, 42, 42)
                .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBookDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtAppointmentStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(appointmetsWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jSplitPane3.setRightComponent(appointmetsWorkAreaPanel);

        javax.swing.GroupLayout appointmentsPanelLayout = new javax.swing.GroupLayout(appointmentsPanel);
        appointmentsPanel.setLayout(appointmentsPanelLayout);
        appointmentsPanelLayout.setHorizontalGroup(
            appointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane3))
        );
        appointmentsPanelLayout.setVerticalGroup(
            appointmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );

        jLayeredPane1.add(appointmentsPanel, "card4");

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Grades");

        btnGradesBack.setText("Back");
        btnGradesBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradesBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnGradesBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGradesBack)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jSplitPane2.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(37, 150, 190));

        dropDownStudent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dropDownStudentItemStateChanged(evt);
            }
        });
        dropDownStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropDownStudentActionPerformed(evt);
            }
        });

        jLabel1.setText("Student:");

        jLabel3.setText("Subject:");

        jLabel5.setText("Assign Grade:");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student Name", "Subject Name", "Subject Marks"
            }
        ));
        jScrollPane1.setViewportView(tblGrade);

        dropDownSubject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dropDownSubjectItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(txtGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dropDownStudent, 0, 168, Short.MAX_VALUE)
                            .addComponent(dropDownSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dropDownSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(dropDownStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(372, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel2);

        javax.swing.GroupLayout gradeStudentPanelLayout = new javax.swing.GroupLayout(gradeStudentPanel);
        gradeStudentPanel.setLayout(gradeStudentPanelLayout);
        gradeStudentPanelLayout.setHorizontalGroup(
            gradeStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradeStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2))
        );
        gradeStudentPanelLayout.setVerticalGroup(
            gradeStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        jLayeredPane1.add(gradeStudentPanel, "card3");

        jSplitPane1.setRightComponent(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dropDownStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropDownStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropDownStudentActionPerformed

    private void btnGradeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradeStudentActionPerformed
        // TODO add your handling code here:
        workAreaPanel.setVisible(false);
        gradeStudentPanel.setVisible(true); 
        appointmentsPanel.setVisible(false);
        
        populateGradesTable();
    }//GEN-LAST:event_btnGradeStudentActionPerformed

    private void dropDownStudentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dropDownStudentItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_dropDownStudentItemStateChanged

    private void dropDownSubjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dropDownSubjectItemStateChanged
        // TODO add your handling code here:
        String subjectName = String.valueOf(dropDownSubject.getSelectedItem());
        int itemCount = dropDownStudent.getItemCount();
        
        for(int i = 0; i < itemCount; i++){
          dropDownStudent.removeItemAt(0);
        }
        
        int subjectCode = ecoSystem.getSubjectDirectory().getSubjectIDByName(subjectName);
        
        for(Student s : ecoSystem.getStudentDirectory().getStudentDirectory()) {
            if(s.isSubjectAssigned(subjectCode)) {
                dropDownStudent.addItem(s.getPersonFirstName());
            }
        }
    }//GEN-LAST:event_dropDownSubjectItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // save grades
        if(!txtGrade.getText().equals("")) {
            String subjectName = dropDownSubject.getSelectedItem().toString();
            int subjectCode = ecoSystem.getSubjectDirectory().getSubjectIDByName(subjectName);
            String studentName = dropDownStudent.getSelectedItem().toString();
            Double grade = Double.parseDouble(txtGrade.getText());
            if(grade>100 || grade<0) {
                JOptionPane.showMessageDialog(this,"Grade can not be more than 100 and less than 0!");
                return;
            }
            Student s = ecoSystem.getStudentDirectory().getStudentByName(studentName);
            s.addGrades(subjectCode, grade);
            populateGradesTable();
            clearForm();
        } else {
            JOptionPane.showMessageDialog(this,"Please do not leave Grade field empty!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGradesBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradesBackActionPerformed
        // TODO add your handling code here:
        switchToWorkAreaPanel();
    }//GEN-LAST:event_btnGradesBackActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        switchToMainFrame();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnGradesBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradesBack1ActionPerformed
        // TODO add your handling code here:
        switchToWorkAreaPanel();
    }//GEN-LAST:event_btnGradesBack1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        workAreaPanel.setVisible(false);
        gradeStudentPanel.setVisible(false);
        appointmentsPanel.setVisible(true);
        
        populateAppointmentTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnViewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentActionPerformed
        // TODO add your handling code here:
        //View appointment
        int selectedRowIndex = tblAppointment.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to View!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel();
        BookAppointment ba = (BookAppointment)model.getValueAt(selectedRowIndex, 0);
        
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(ba.getDate());
            jBookDate.setDate(date);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(SchoolAdminDashboardJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        String studentName = ecoSystem.getStudentDirectory().getStudentNameByID(ba.getStudentID());
        String topic = ba.getTopic();
        
        txtAppointmentStudent.setText(studentName);
        txtAppointmentStudent.setEditable(false);
        txtTopic.setText(topic);
        txtTopic.setEditable(false);
    }//GEN-LAST:event_btnViewAppointmentActionPerformed

    private void btnUpdateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAppointmentActionPerformed
        // TODO add your handling code here:
        // update appointment
        txtAppointmentStudent.setEditable(false);
        txtTopic.setEditable(false);
        if(!jBookDate.getDate().equals(null)) {
            Date Datedob = jBookDate.getDate();
            String bookDate = DateFormat.getDateInstance().format(Datedob);
            String studentID = ecoSystem.getStudentDirectory().getStudentIDByName(txtAppointmentStudent.getText());

            BookAppointment ba = ecoSystem.getBookAppointmentDirectory().getAppointmentbyStudentID(studentID);
            ba.setDate(bookDate);
            JOptionPane.showMessageDialog(this,"Appointment Rescheduled!");
            populateAppointmentTable();
            clearAppointmentForm();
        } else {
            JOptionPane.showMessageDialog(this,"Please do not leave Date field empty!");
            return;
        }
    }//GEN-LAST:event_btnUpdateAppointmentActionPerformed

    private void btnDeleteAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAppointmentActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAppointment.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to View!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel();
        BookAppointment ba = (BookAppointment)model.getValueAt(selectedRowIndex, 0);
        
        ecoSystem.getBookAppointmentDirectory().deleteAppointment(ba);
        JOptionPane.showMessageDialog(this, "Appointment Cancelled!");
        populateAppointmentTable();
        clearAppointmentForm();
    }//GEN-LAST:event_btnDeleteAppointmentActionPerformed
    
    private void populateGradesTable() {
        DefaultTableModel model = (DefaultTableModel) tblGrade.getModel();
        model.setRowCount(0);
        
        for(Student s :  ecoSystem.getStudentDirectory().getStudentDirectory()) {
            s.getGrades().forEach((k, v) -> {
                Object[] row = new Object[3];
                row[0] = s;
                String subjectName = ecoSystem.getSubjectDirectory().getSubjectNameByID(k);
                row[1] = subjectName;
                row[2] = v;
                model.addRow(row);
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appointmentsPanel;
    private javax.swing.JPanel appointmetsWorkAreaPanel;
    private javax.swing.JButton btnDeleteAppointment;
    private javax.swing.JButton btnGradeStudent;
    private javax.swing.JButton btnGradesBack;
    private javax.swing.JButton btnGradesBack1;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnUpdateAppointment;
    private javax.swing.JButton btnViewAppointment;
    private javax.swing.JPanel controlArea;
    private javax.swing.JComboBox<String> dropDownStudent;
    private javax.swing.JComboBox<String> dropDownSubject;
    private javax.swing.JPanel gradeStudentPanel;
    private com.toedter.calendar.JDateChooser jBookDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JTable tblGrade;
    private javax.swing.JTextField txtAppointmentStudent;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextArea txtTopic;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables

    private void populateAppointmentTable() {
        DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel();
        model.setRowCount(0);
        
        for(BookAppointment ba : ecoSystem.getBookAppointmentDirectory().getBookAppointmentDirectory()) {
            if(ba.getTeacherID().equals(userLogged.getPersonId())){
                Object[] row = new Object[3];
                row[0] = ba;
                String studentName = ecoSystem.getStudentDirectory().getStudentNameByID(ba.getStudentID());
                row[1] = studentName;
                row[2] = ba.getTopic();
                model.addRow(row);
            }
        }
    }
    
    private void clearForm() {
        dropDownSubject.setSelectedIndex(0);
        dropDownStudent.setSelectedIndex(0);
        txtGrade.setText("");
    }

    private void switchToWorkAreaPanel() {
        workAreaPanel.setVisible(true);
        gradeStudentPanel.setVisible(false); 
        appointmentsPanel.setVisible(false);
    }

    private void switchToMainFrame() {
        this.setVisible(false);
        MainJFrame mainFrame = (MainJFrame) SwingUtilities.getRoot(this);
        mainFrame.removeTeacherDashboardJPanel();
        mainFrame.setVisible(true);
    }

    private void clearAppointmentForm() {
        jBookDate.setDate(null);
        txtAppointmentStudent.setText("");
        txtTopic.setText("");
    }
}
