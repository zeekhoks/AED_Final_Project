/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import businesslogic.City;
import businesslogic.CityDirectory;
import businesslogic.CommunityDirectory;
import businesslogic.DB4OUtil.DB4OUtil;
import businesslogic.EcoSystem;
import businesslogic.MealManagement.MealPlanAdmin;
import businesslogic.MealManagement.MealPlanDirectory;
import businesslogic.Person;
import businesslogic.Person.UserRole;
import businesslogic.PersonDirectory;
import businesslogic.PersonU;
import businesslogic.PersonUDirectory;
import businesslogic.UniversityManagement.AppointmentDirectory;
import businesslogic.UniversityManagement.CourseAssignmentDirectory;
import businesslogic.UniversityManagement.CourseDirectory;
import businesslogic.UniversityManagement.PlacementCoordinator;
import businesslogic.UniversityManagement.Professor;
import businesslogic.UniversityManagement.ProfessorDirectory;
import businesslogic.UniversityManagement.StudentU;
import businesslogic.UniversityManagement.StudentUDirectory;
import businesslogic.UniversityManagement.UniversityAdmin;
import businesslogic.school.SchoolAdmin;
import businesslogic.school.SchoolDirectory;
import businesslogic.school.Student;
import businesslogic.school.StudentDirectory;
import businesslogic.school.Teacher;
import businesslogic.school.TeacherDirectory;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.MealPlanManagement.MealPlanDashboard;
import ui.UniversityManagement.PlacementCoordinatorDashboard;
import ui.UniversityManagement.ProfessorDashboard;
import ui.UniversityManagement.StudentDashboard;
import ui.UniversityManagement.UniversityAdminDashboard;
import ui.school.SchoolAdminRole.SchoolAdminDashboardJPanel;
import ui.school.StudentRole.StudentDashboardJPanel;
import ui.school.TeacherRole.TeacherDashboardJPanel;
import ui.systemAdmin.SystemAdminDashboardJPanel;

/**
 *
 * @author drashtibhingradiya
 */
public class MainJFrame extends javax.swing.JFrame {

    private static final Logger logger = Logger.getLogger(MainJFrame.class.getName());
    private EcoSystem ecoSystem;
    
    PersonDirectory personDirectory;
    CityDirectory cityDirectory;
    CommunityDirectory communityDirectory;
    SchoolDirectory schoolDirectory;
    StudentDirectory studentDirectory;
    TeacherDirectory teacherDirectory;
    
    StudentUDirectory studentUDirectory;
    ProfessorDirectory professorDirectory;
    CourseDirectory courseDirectory;
    AppointmentDirectory appointmentDirectory;
    PersonUDirectory personUDirectory;
//    CommunityDirectory communityDirectory;
    CourseAssignmentDirectory courseAssignment;
    MealPlanDirectory mealPlanDirectoryRef;
    
    
    JPanel SchoolAdminDashboardJPanel;
    JPanel SystemAdminDashboardJPanel;
    JPanel TeacherDashboardJPanel;
    JPanel StudentDashboardJPanel;
    JPanel mealPlanAdminDashboard;
    
    public static JPanel universityAdminDashboard;
//    public static JPanel mealPlanAdminDashboard;
    public static JPanel studentDashboard;
    public static JPanel professorDashboard;
    public static JPanel placementCoordinatorDashboard;
    
    
    
    private static int flag = 0;
    private DB4OUtil db4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        initComponents();
        setSize(1060, 770);
        if(flag == 0){
            ecoSystem = db4OUtil.retrieveSystem();
        
            if(ecoSystem.getCityDirectory() != null) {
                this.cityDirectory = ecoSystem.getCityDirectory();
            } else {
                this.cityDirectory = new CityDirectory();
            }

            if(ecoSystem.getCommunityDirectory() != null) {
                this.communityDirectory = ecoSystem.getCommunityDirectory();
            } else{
                this.communityDirectory = new CommunityDirectory();
            }
            if(ecoSystem.getPersonDirectory() != null) {
                this.personDirectory = ecoSystem.getPersonDirectory();
            } else {
                this.personDirectory = new PersonDirectory();
            }

            if(ecoSystem.getSchoolDirectory() != null) {
                this.schoolDirectory = ecoSystem.getSchoolDirectory();
            } else {
                this.schoolDirectory = new SchoolDirectory();
            }

            if(ecoSystem.getStudentDirectory() != null) {
                this.studentDirectory = ecoSystem.getStudentDirectory();
            } else {
                this.studentDirectory = new StudentDirectory();
            }

            if(ecoSystem.getTeacherDirectory() != null) {
                this.teacherDirectory = ecoSystem.getTeacherDirectory();
            } else {
                this.teacherDirectory = new TeacherDirectory();
            }
            
            if(ecoSystem.getPersonDirectoryRef()!=null){
                this.personUDirectory = ecoSystem.getPersonDirectoryRef();
            } else {
                this.personUDirectory = new PersonUDirectory();
            }
            
            if (ecoSystem.getStudentDirectoryRef() != null) {
                this.studentUDirectory = ecoSystem.getStudentDirectoryRef();
            } else {
                this.studentUDirectory = new StudentUDirectory();
            }

            if (ecoSystem.getCourseDirectoryRef() != null) {
                this.courseDirectory = ecoSystem.getCourseDirectoryRef();
            } else {
                this.courseDirectory = new CourseDirectory();
            }

//            if (ecoSystem.getPersonDirectoryRef() != null) {
//                this.personUDirectory = ecoSystem.getPersonDirectoryRef();
//            } else {
//                this.personUDirectory = new PersonUDirectory();
//            }

            if (ecoSystem.getAppointmentDirectoryRef() != null) {
                this.appointmentDirectory = ecoSystem.getAppointmentDirectoryRef();
            } else {
                this.appointmentDirectory = new AppointmentDirectory();
            }

            if (ecoSystem.getCommunityDirectoryRef() != null) {
                this.communityDirectory = ecoSystem.getCommunityDirectoryRef();
            } else {
                this.communityDirectory = new CommunityDirectory();
            }

            if (ecoSystem.getProfessorDirectoryRef() != null) {
                this.professorDirectory = ecoSystem.getProfessorDirectoryRef();
            } else {
                this.professorDirectory = new ProfessorDirectory();
            }

            if (ecoSystem.getCourseAssignment() != null) {
                this.courseAssignment = ecoSystem.getCourseAssignment();
            } else {
                this.courseAssignment = new CourseAssignmentDirectory();
            }

            if (ecoSystem.getMealPlanDirectoryRef() != null) {
                this.mealPlanDirectoryRef = ecoSystem.getMealPlanDirectoryRef();
            } else {
                this.mealPlanDirectoryRef = new MealPlanDirectory();
            }
           
        }
        flag++;
        
        
//        personDirectory = new PersonDirectory();
        
//        personDirectory.addPerson(new Person(null,null,null, null,
//                null,1234567890,"systemAdmin@gmail.com",null,
//                "1234", UserRole.SYSTEM_ADMIN));
//        
//        personDirectory.addPerson(new Person(null,null,null, null,
//                null,1234567890,"schoolAdmin@gmail.com",null,
//                "1234", UserRole.SCHOOL_ADMIN));
        
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(52, 84, 87));

        mainWorkArea.setBackground(new java.awt.Color(52, 84, 87));
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logomain.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(btnLogin))
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
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)))
                .addContainerGap(261, Short.MAX_VALUE))
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
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "Login Button pressed");
        
        String userName = txtUsername.getText();
        char[] passwordChars = txtPassword.getPassword();
        String password = String.valueOf(passwordChars);
        
        if(userName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be Empty");
            return;
        }else{
            if(password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password cannot be Empty");
                return;
            }
        }
        Person userLogged = null;
        
        logger.log(Level.INFO, "Checking credentials in Person Directory");
        
        if(!ecoSystem.getPersonDirectory().getPersonDirectory().isEmpty()){
            userLogged = ecoSystem.getPersonDirectory().authenticateAdmin(userName, password);
            if(userLogged != null){
                String role = ecoSystem.getPersonDirectory().getPersonRole(userName);
                switch(role){
                    case "SYSTEM_ADMIN":
                        clearLoginPanel();
                        SystemAdminDashboardJPanel = new SystemAdminDashboardJPanel(ecoSystem, userLogged);
                        mainWorkArea.add("SyslogintemAdminDashboardJPanel",SystemAdminDashboardJPanel);
                        CardLayout cd1 = (CardLayout) mainWorkArea.getLayout();
                        cd1.next(mainWorkArea);
                        break;
                }
            } 
        } 
        logger.log(Level.INFO, "Checking credentials in PersonU Directory");
        PersonU person = null;
        
        for(PersonU p: ecoSystem.getPersonDirectoryRef().getPersonDirectory()){
            if(p.getPersonEmailAddress().equals(userName)&&p.getUserPassword().equals(password))
                person = p;
        }
        
        if(person!=null){
            
            switch (person.getUserRole()) {
                case UNIVERSITY_ADMIN:
                    universityAdminDashboard = new UniversityAdminDashboard(ecoSystem, (UniversityAdmin) person);
                    mainWorkArea.add("universityAdminDashboard", universityAdminDashboard);
                    CardLayout cd1 = (CardLayout) mainWorkArea.getLayout();
                    cd1.next(mainWorkArea);
                    break;
                case MEALPLAN_ADMIN:
                    mealPlanAdminDashboard = new MealPlanDashboard(ecoSystem);
                    mainWorkArea.add("mealPlanAdminDashboard", mealPlanAdminDashboard);
                    CardLayout cd2 = (CardLayout) mainWorkArea.getLayout();
                    cd2.next(mainWorkArea);
                    break;
                case STUDENT:
                    studentDashboard = new StudentDashboard(ecoSystem, (StudentU) person);
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
                    placementCoordinatorDashboard = new PlacementCoordinatorDashboard(ecoSystem, (PlacementCoordinator) person);
                    mainWorkArea.add("placementCoordinatorDashboard", placementCoordinatorDashboard);
                    CardLayout cd5 = (CardLayout) mainWorkArea.getLayout();
                    cd5.next(mainWorkArea);
                    break;

            }
        }
        
        logger.log(Level.INFO, "Checking credentials in School Admin Directory");
        
        if(userLogged == null) {
            if(!ecoSystem.getSchoolAdminDirectory().getSchoolAdminDirectory().isEmpty()) {
                userLogged = ecoSystem.getSchoolAdminDirectory().authenticateAdmin(userName, password);
//                logger.log(Level.INFO,userLogged.getPersonEmailAddress());
                if(userLogged != null) {
                    clearLoginPanel();
//                    logger.log(Level.INFO, "in if");
                    SchoolAdminDashboardJPanel = new SchoolAdminDashboardJPanel(ecoSystem, (SchoolAdmin)userLogged);
                    mainWorkArea.add("SchoolAdminDashboardJPanel",SchoolAdminDashboardJPanel);
                    CardLayout cd2 = (CardLayout) mainWorkArea.getLayout();
                    cd2.next(mainWorkArea);
                    return;
                }
            }
        } 
        
        logger.log(Level.INFO, "Checking credentials in Teacher Directory");
        
        if(userLogged == null) {
            if(!ecoSystem.getTeacherDirectory().getTeacherDirectory().isEmpty()) {
                userLogged = ecoSystem.getTeacherDirectory().authenticateTeacher(userName, password);
                if(userLogged != null) {
                    clearLoginPanel();
                    TeacherDashboardJPanel = new TeacherDashboardJPanel(ecoSystem, (Teacher)userLogged);
                    mainWorkArea.add("TeacherDashboardJPanel", TeacherDashboardJPanel);
                    CardLayout cd3 = (CardLayout) mainWorkArea.getLayout();
                    cd3.next(mainWorkArea);
                    return;
                }
            }
        }
        
        logger.log(Level.INFO, "Checking credentials in School Student Directory");
        
        if(userLogged == null) {
            if(!ecoSystem.getStudentDirectory().getStudentDirectory().isEmpty()) {
                userLogged = ecoSystem.getStudentDirectory().authenticateStudent(userName, password);
                if(userLogged != null) {
                    clearLoginPanel();
                    
                    StudentDashboardJPanel = new StudentDashboardJPanel(ecoSystem, (Student)userLogged);
                    
                    mainWorkArea.add("StudentDashboardJPanel",StudentDashboardJPanel);
                    CardLayout cd4 = (CardLayout) mainWorkArea.getLayout();
                    cd4.next(mainWorkArea);
                    return;
                }
            }
        } 
        
        if(userLogged == null && person == null) {
            JOptionPane.showMessageDialog(this, "User does not exist!");
        }
        
        
    }//GEN-LAST:event_btnLoginActionPerformed
    
//    public void changePanel(JPanel panel) {
//        removeAll();
//        add(panel);
//        revalidate();
//        repaint();
//    }
    
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
                new MainJFrame().setVisible(true);
                
            }
        });
    }
    
    public void removeSchoolAdminDashboardJPanel() {
        mainWorkArea.remove(SchoolAdminDashboardJPanel);
    }
    
    public void removeSystemAdminDashboardJPanel() {
        mainWorkArea.remove(SystemAdminDashboardJPanel);
    }
    
    public void removeMealPlanDashboard() {
        mainWorkArea.remove(mealPlanAdminDashboard);
    }
    
    public void removeUniversityAdminDashboard() {
        mainWorkArea.remove(universityAdminDashboard);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel mainWorkArea;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void clearLoginPanel() {
        txtUsername.setText("");
        txtPassword.setText("");
    }

    public void loadDefaultState() {

    }

    public void removeTeacherDashboardJPanel() {
        mainWorkArea.remove(TeacherDashboardJPanel);
    }
    
    public void removeSchoolStudentDashboardJPanel() {
        mainWorkArea.remove(StudentDashboardJPanel);
    }
    
    public void removeStudentDashboard() {
        mainWorkArea.remove(studentDashboard);
    }

    public void removeProfessorDashboard() {
        mainWorkArea.remove(professorDashboard);
    }
}
