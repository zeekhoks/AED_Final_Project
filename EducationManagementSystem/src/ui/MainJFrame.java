/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import businesslogic.CommunityDirectory;
import businesslogic.DB4OUtil.DB4OUtil;
import businesslogic.EcoSystem;
import businesslogic.MealManagement.MealPlanAdmin;
import businesslogic.PersonU;
import businesslogic.PersonUDirectory;
import businesslogic.UniversityManagement.AppointmentDirectory;
import businesslogic.UniversityManagement.CourseAssignmentDirectory;
import businesslogic.UniversityManagement.CourseDirectory;
import businesslogic.UniversityManagement.PlacementCoordinator;
import businesslogic.UniversityManagement.Professor;
import businesslogic.UniversityManagement.ProfessorDirectory;
import businesslogic.UniversityManagement.Student;
import businesslogic.UniversityManagement.StudentDirectory;
import businesslogic.UniversityManagement.UniversityAdmin;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.MealPlanManagement.MealPlanDashboard;
import ui.UniversityManagement.PlacementCoordinatorDashboard;
import ui.UniversityManagement.ProfessorDashboard;
import ui.UniversityManagement.StudentDashboard;
import ui.UniversityManagement.UniversityAdminDashboard;
import ui.school.SchoolAdminRole.SchoolAdminDashboardJPanel;
import ui.school.StudentRole.StudentDashboardJPanel;

/**
 *
 * @author drashtibhingradiya
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private EcoSystem ecoSystem;
    StudentDirectory studentDirectory;
    ProfessorDirectory professorDirectory;
    CourseDirectory courseDirectory;
    AppointmentDirectory appointmentDirectory;
    PersonUDirectory personUDirectory;
    CommunityDirectory communityDirectory;
    CourseAssignmentDirectory courseAssignment;
    
    
    
    private static int flag = 0;
    private DB4OUtil db4OUtil = DB4OUtil.getInstance();
 

    /**
     * Creates new form MainJFrame
     */
    private static final Logger logger = Logger.getLogger(MainJFrame.class.getName());
    public static JFrame mainJFrame;
    public static JPanel universityAdminDashboard;
    public static JPanel mealPlanAdminDashboard;
    public static JPanel studentDashboard;
    public static JPanel professorDashboard;
    public static JPanel placementCoordinatorDashboard;
    
    public MainJFrame() {
        initComponents();
        this.studentDirectory = studentDirectory;
        this.professorDirectory = professorDirectory;
        this.courseDirectory = courseDirectory;
        this.appointmentDirectory = appointmentDirectory;
        this.communityDirectory = communityDirectory;
        this.personUDirectory = personUDirectory;
        this.courseAssignment = courseAssignment;
//        MainFrame.getContentPane().setSize(new Dimension(100, 200));
        setSize(1060, 770);
        
         if(flag == 0){
            ecoSystem = db4OUtil.retrieveSystem();
            
            if(ecoSystem.getStudentDirectoryRef() != null){
                this.studentDirectory = ecoSystem.getStudentDirectoryRef();
            } else {
                this.studentDirectory = new StudentDirectory();
            }
           
            if(ecoSystem.getCourseDirectoryRef() != null){
                this.courseDirectory = ecoSystem.getCourseDirectoryRef();
            } else {
                this.courseDirectory = new CourseDirectory();
            }
            
            if(ecoSystem.getPersonDirectoryRef()!=null){
                this.personUDirectory = ecoSystem.getPersonDirectoryRef();
            } else {
                this.personUDirectory = new PersonUDirectory();
            }
            
            if(ecoSystem.getAppointmentDirectoryRef()!=null){
                this.appointmentDirectory = ecoSystem.getAppointmentDirectoryRef();
            } else {
                this.appointmentDirectory = new AppointmentDirectory();
            }
            
            if(ecoSystem.getCommunityDirectoryRef()!=null){
                this.communityDirectory = ecoSystem.getCommunityDirectoryRef();
            } else {
                this.communityDirectory = new CommunityDirectory();
            }
            
            if(ecoSystem.getProfessorDirectoryRef()!=null){
                this.professorDirectory = ecoSystem.getProfessorDirectoryRef();
            } else {
                this.professorDirectory = new ProfessorDirectory();
            }
            
            if(ecoSystem.getCourseAssignment() != null){
                this.courseAssignment = ecoSystem.getCourseAssignment();
            } else {
                this.courseAssignment = new CourseAssignmentDirectory();
            }

    }
     flag++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWorkArea = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(98, 189, 234));

        mainWorkArea.setBackground(new java.awt.Color(98, 189, 234));
        mainWorkArea.setLayout(new java.awt.CardLayout());

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        btnLogin.setText("Log In");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblPassword.setText("Password:");

        lblUsername.setText("Username: ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = txtUsername.getText();
        String userPassword = String.valueOf(txtPassword.getPassword());
        
        PersonU person = null;
        
        for(PersonU p: ecoSystem.getPersonDirectoryRef().getPersonDirectory()){
            if(p.getPersonEmailAddress().equals(userName)&&p.getUserPassword().equals(userPassword))
               person = p;
       }
        
        if(person!=null){
            
            switch(person.getUserRole()){
               case UNIVERSITY_ADMIN:
                    universityAdminDashboard = new UniversityAdminDashboard(ecoSystem, (UniversityAdmin)person);
                    mainWorkArea.add("universityAdminDashboard", universityAdminDashboard);
                    CardLayout cd1 = (CardLayout) mainWorkArea.getLayout();
                    cd1.next(mainWorkArea);
                    break;
               case MEALPLAN_ADMIN:
                    mealPlanAdminDashboard = new MealPlanDashboard(ecoSystem, (MealPlanAdmin) person);
                   mainWorkArea.add("mealPlanAdminDashboard", mealPlanAdminDashboard);
                    CardLayout cd2 = (CardLayout) mainWorkArea.getLayout();
                    cd2.next(mainWorkArea);
                    break;
               case STUDENT:
                    studentDashboard = new StudentDashboard(ecoSystem, (Student) person);
                    mainWorkArea.add("studentDashboard", studentDashboard);
                    CardLayout cd3 = (CardLayout) mainWorkArea.getLayout();
                   cd3.next(mainWorkArea);
                   break;
               case PROFESSOR:
                    professorDashboard = new ProfessorDashboard(ecoSystem, (Professor) person);
                    mainWorkArea.add("professorDashboard", professorDashboard);
                   CardLayout cd4 = (CardLayout) mainWorkArea.getLayout();
                    cd4.next(mainWorkArea);
                   break;
               case PLACEMENT_COORDINATOR:
                   placementCoordinatorDashboard = new PlacementCoordinatorDashboard(ecoSystem, (PlacementCoordinator)person);
                   mainWorkArea.add("placementCoordinatorDashboard", placementCoordinatorDashboard);
                    CardLayout cd5 = (CardLayout) mainWorkArea.getLayout();
                   cd5.next(mainWorkArea);
                   break;
                   
               
           } 

       
        } else {
                    JOptionPane.showMessageDialog(this, "User does not exist!");
           }
        
            
  
        
    }//GEN-LAST:event_btnLoginActionPerformed
    
    public void changePanel(JPanel panel) {
        removeAll();
        add(panel);
        revalidate();
        repaint();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(mainJFrame == null)
                    mainJFrame = new MainJFrame();
                mainJFrame.setVisible(true);
                
            }
        });
    }
    
    public void removeUniversityAdminDashboard() {
        mainWorkArea.remove(universityAdminDashboard);
    }
    
    public void removeMealPlanDashboard(){
        mainWorkArea.remove(mealPlanAdminDashboard);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel mainWorkArea;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public void removeStudentDashboard() {
         mainWorkArea.remove(studentDashboard);
    }

    public void removeProfessorDashboard() {
        mainWorkArea.remove(professorDashboard);
    }
}
