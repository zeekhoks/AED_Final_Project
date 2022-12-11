/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.MealPlanManagement;

import businesslogic.City;
import businesslogic.Community;
import businesslogic.EcoSystem;
import businesslogic.MealManagement.MealPlan;
//import businesslogic.UniversityManagement.Course;
//import businesslogic.UniversityManagement.Degree;
//import businesslogic.UniversityManagement.Professor;
//import businesslogic.UniversityManagement.Student;
//import businesslogic.UniversityManagement.UniversityAdmin;
import ui.school.SchoolAdminRole.*;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.List;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import ui.MainJFrame;

/**
 *
 * @author drashtibhingradiya
 */
public class MealPlanDashboard extends javax.swing.JPanel {

//    public static JPanel universityAdminDashboard;
    
    /**
     * Creates new form DashboardJPanel
     */
//    private ImageIcon studentPhoto;
//    private String photoPath = "/icons/default.jpg";
    private EcoSystem ecoSystem;

    public MealPlanDashboard(EcoSystem ecoSystem) {
        
        initComponents();
        this.ecoSystem = ecoSystem;
        populateMealPlanTable();
        setSize(1060, 770);
        workAreaPanel.setVisible(true);
        mealPlanPanel.setVisible(false);
       
        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        MealPlanDashboardPanel = new javax.swing.JSplitPane();
        leftPane = new javax.swing.JPanel();
        btnMealOrders = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        rightPane = new javax.swing.JLayeredPane();
        workAreaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        workAreaPane = new javax.swing.JLabel();
        mealPlanPanel = new javax.swing.JPanel();
        mealSplitPane = new javax.swing.JSplitPane();
        navigateBackPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblManageStudents = new javax.swing.JLabel();
        studentWorkAreaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMealPlan = new javax.swing.JTable();
        txtMealPlanID = new javax.swing.JTextField();
        lblMealID = new javax.swing.JLabel();
        lblMealDescription = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblMealPlan = new javax.swing.JLabel();
        comboMeal = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMealDescription = new javax.swing.JTextArea();
        lblMealType = new javax.swing.JLabel();
        comboMealType = new javax.swing.JComboBox<>();

        leftPane.setBackground(new java.awt.Color(0, 153, 153));

        btnMealOrders.setText("Meal Orders");
        btnMealOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMealOrdersActionPerformed(evt);
            }
        });

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMealOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(btnMealOrders)
                .addGap(263, 263, 263)
                .addComponent(btnLogOut)
                .addGap(198, 198, 198))
        );

        MealPlanDashboardPanel.setLeftComponent(leftPane);

        rightPane.setLayout(new java.awt.CardLayout());

        workAreaPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME MEAL SUPPLIER");
        workAreaPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 800, -1));

        workAreaPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/blue.jpeg"))); // NOI18N
        workAreaPanel.add(workAreaPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 870));

        rightPane.add(workAreaPanel, "card2");

        mealSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        navigateBackPanel.setBackground(new java.awt.Color(0, 0, 0));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblManageStudents.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblManageStudents.setForeground(new java.awt.Color(255, 255, 255));
        lblManageStudents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageStudents.setText("Manage Meal Supply");

        javax.swing.GroupLayout navigateBackPanelLayout = new javax.swing.GroupLayout(navigateBackPanel);
        navigateBackPanel.setLayout(navigateBackPanelLayout);
        navigateBackPanelLayout.setHorizontalGroup(
            navigateBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigateBackPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(lblManageStudents)
                .addGap(236, 236, 236)
                .addComponent(btnLogout)
                .addGap(48, 48, 48))
        );
        navigateBackPanelLayout.setVerticalGroup(
            navigateBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigateBackPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(navigateBackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnLogout)
                    .addComponent(lblManageStudents))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mealSplitPane.setTopComponent(navigateBackPanel);

        studentWorkAreaPanel.setBackground(new java.awt.Color(37, 150, 190));

        tblMealPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meal Plan ID", "Meal Plan", "Meal Plan Type", "Meal Plan Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblMealPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMealPlanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMealPlan);

        lblMealID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMealID.setText("Meal ID");

        lblMealDescription.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMealDescription.setText("Meal Description");

        btnCreate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCreate.setText("SAVE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblMealPlan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMealPlan.setText("Meal Plan");

        comboMeal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day Plan", "Month Plan", "Week Plan" }));
        comboMeal.setSelectedIndex(-1);

        txtMealDescription.setColumns(20);
        txtMealDescription.setRows(5);
        jScrollPane2.setViewportView(txtMealDescription);

        lblMealType.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMealType.setText("Meal Type");

        comboMealType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vegetarian", "Non Vegetarian", "Vegan" }));
        comboMealType.setSelectedIndex(-1);

        javax.swing.GroupLayout studentWorkAreaPanelLayout = new javax.swing.GroupLayout(studentWorkAreaPanel);
        studentWorkAreaPanel.setLayout(studentWorkAreaPanelLayout);
        studentWorkAreaPanelLayout.setHorizontalGroup(
            studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentWorkAreaPanelLayout.createSequentialGroup()
                .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentWorkAreaPanelLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMealID, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMealDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMealPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMealType, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMealPlanID)
                            .addComponent(comboMeal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(comboMealType, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(studentWorkAreaPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentWorkAreaPanelLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        studentWorkAreaPanelLayout.setVerticalGroup(
            studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentWorkAreaPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMealPlanID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMealID))
                .addGap(18, 18, 18)
                .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMealPlan)
                    .addComponent(comboMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMealType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMealType))
                .addGap(18, 18, 18)
                .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMealDescription))
                .addGap(28, 28, 28)
                .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        mealSplitPane.setRightComponent(studentWorkAreaPanel);

        javax.swing.GroupLayout mealPlanPanelLayout = new javax.swing.GroupLayout(mealPlanPanel);
        mealPlanPanel.setLayout(mealPlanPanelLayout);
        mealPlanPanelLayout.setHorizontalGroup(
            mealPlanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mealPlanPanelLayout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(mealSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mealPlanPanelLayout.setVerticalGroup(
            mealPlanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mealSplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        rightPane.add(mealPlanPanel, "card3");

        MealPlanDashboardPanel.setRightComponent(rightPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MealPlanDashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MealPlanDashboardPanel))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        switchToMainFrame();

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
//        CREATE MEAL
        int mealPlanID = Integer.parseInt(txtMealPlanID.getText());
        String mealPlanName = comboMeal.getSelectedItem().toString();
        String mealPlanType = comboMealType.getSelectedItem().toString();
        String mealDescription = txtMealDescription.getText();
        
        
        List<Integer> mealIdList = ecoSystem.getMealPlanDirectoryRef()
                .getMealPlanDirectory().stream().map(x -> x.getMealID()).toList();
//        List<String> studentIdList = UniversityAdmin.studentDirectoryRef.getStudentDirectory().stream().map(x -> x.getStudentID()).toList();

        if (mealIdList.contains(mealPlanID)) {
            JOptionPane.showMessageDialog(this, "Meal plan already exists. Please check");
        } else {
            MealPlan mealPlan = new MealPlan(mealPlanID, mealPlanName, mealDescription, mealPlanType);

            ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().add(mealPlan);
            JOptionPane.showMessageDialog(this, "New Meal Plan Added Successfully!");

            txtMealPlanID.setText("");
            comboMeal.setSelectedIndex(-1);
            comboMealType.setSelectedIndex(-1);
            txtMealDescription.setText("");
            
            populateMealPlanTable();

        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
//        VIEW MEAL
        int selected = tblMealPlan.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update!");
            return;
        }

        MealPlan mealPlan = ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().get(selected);
        String meanPlan = mealPlan.getMealPlan();
        String mealType = mealPlan.getMealType();
        txtMealPlanID.setText(String.valueOf(mealPlan.getMealID()));
        txtMealDescription.setText(mealPlan.getMealDescription());
        comboMeal.setSelectedItem(mealPlan);
        comboMealType.setSelectedItem(mealType);


    }//GEN-LAST:event_btnViewActionPerformed

    private void btnMealOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMealOrdersActionPerformed
        // TODO add your handling code here:
        workAreaPanel.setVisible(false);
        mealPlanPanel.setVisible(true);
    }//GEN-LAST:event_btnMealOrdersActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        switchToMainFrame();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        UPDATE STUDENT
        int selected = tblMealPlan.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update!");
            return;
        }
        
        int mealPlanID = Integer.parseInt(txtMealPlanID.getText());
        String mealPlanName = comboMeal.getSelectedItem().toString();
        String mealPlanType = comboMealType.getSelectedItem().toString();
        String mealDescription = txtMealDescription.getText();
        
        MealPlan mealPlan = ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().get(selected);
        

        mealPlan.setMealID(mealPlanID);
        mealPlan.setMealPlan(mealPlanName);
        mealPlan.setMealType(mealPlanType);
        mealPlan.setMealDescription(mealDescription);
        
        populateMealPlanTable();

        JOptionPane.showMessageDialog(this, "Meal plan details updated successfully!");

    txtMealPlanID.setText("");
            comboMeal.setSelectedIndex(-1);
            comboMealType.setSelectedIndex(-1);
            txtMealDescription.setText("");
       


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
//        DELETE STUDENT
        int selected = tblMealPlan.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
            return;
        }
        
        MealPlan mealPlan = ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().get(selected);
        
        
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory().remove(mealPlan);
        
        JOptionPane.showMessageDialog(this, "Meal plan details deleted successfully!");


        populateMealPlanTable();

       txtMealPlanID.setText("");
            comboMeal.setSelectedIndex(-1);
            comboMealType.setSelectedIndex(-1);
            txtMealDescription.setText("");


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblMealPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMealPlanMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tblMealPlanMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        switchToWorkAreaPanel();
    }//GEN-LAST:event_btnBackActionPerformed
    private void switchToMainFrame() {
        this.setVisible(false);
        MainJFrame mainFrame = (MainJFrame) SwingUtilities.getRoot(this);
        mainFrame.removeMealPlanDashboard();
        mainFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane MealPlanDashboardPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMealOrders;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboMeal;
    private javax.swing.JComboBox<String> comboMealType;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageStudents;
    private javax.swing.JLabel lblMealDescription;
    private javax.swing.JLabel lblMealID;
    private javax.swing.JLabel lblMealPlan;
    private javax.swing.JLabel lblMealType;
    private javax.swing.JPanel leftPane;
    private javax.swing.JPanel mealPlanPanel;
    private javax.swing.JSplitPane mealSplitPane;
    private javax.swing.JPanel navigateBackPanel;
    private javax.swing.JLayeredPane rightPane;
    private javax.swing.JPanel studentWorkAreaPanel;
    private javax.swing.JTable tblMealPlan;
    private javax.swing.JTextArea txtMealDescription;
    private javax.swing.JTextField txtMealPlanID;
    private javax.swing.JLabel workAreaPane;
    private javax.swing.JPanel workAreaPanel;
    // End of variables declaration//GEN-END:variables

    private void populateMealPlanTable() {
        DefaultTableModel model = (DefaultTableModel) tblMealPlan.getModel();
        model.setRowCount(0);
        for (MealPlan mp : ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory()) {
            Object[] rowData = new Object[4];
            rowData[0] = mp.getMealID();
            rowData[1] = mp.getMealPlan();
            rowData[2] = mp.getMealType();
            rowData[3] = mp.getMealDescription();
            model.addRow(rowData);
        }
    }


    private void populateMealPlan(){
        comboMeal.setSelectedIndex(-1);
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory()
                .forEach(m -> comboMeal.addItem(m.getMealPlan()));
    }
    
    private void populateMealPlanType(){
        comboMealType.setSelectedIndex(-1);
        ecoSystem.getMealPlanDirectoryRef().getMealPlanDirectory()
                .forEach(m -> comboMealType.addItem(m.getMealType()));
    }

    private void switchToWorkAreaPanel() {
        workAreaPanel.setVisible(true);
        mealPlanPanel.setVisible(false);
    }
    

    
}
