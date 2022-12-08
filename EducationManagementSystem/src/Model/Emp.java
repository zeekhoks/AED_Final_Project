package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import UI.ManageEmp;

/**
 *
 * @author Hinal
 */

public class Emp {

    public void EmployeeManageSchool(String op, String name, String fname, String mname, String phone, String dateOfBirth, String gender, String designation, String email, String presentAdd ,String status, String ssn) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO school_employees (employee_name,father,mother,phone,date_of_birth, gender, designation, email, address,status, ssn) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, phone);
                ps.setString(5, dateOfBirth);
                ps.setString(6, gender);
                ps.setString(7, designation);
                ps.setString(8, email);
                ps.setString(9, presentAdd);
                ps.setString(10, status);
                ps.setString(11, ssn);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Employee Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {

            try {
                con = MyConnection.getConnection();
                Statement st = con.createStatement();

                String sql = "update school_employees set employee_name=?, father=?, mother=?,date_of_birth=?,gender=?,designation=?,email=?,address=?,status=? ,ssn=? where phone=?";

                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, dateOfBirth);
                ps.setString(5, gender);
                ps.setString(6, designation);
                ps.setString(7, email);
                ps.setString(8, presentAdd);           
                ps.setString(9, status);  
                ps.setString(10, ssn); 
                ps.setString(11, phone);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

         if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Details of Employee Salary will also be deleted", "Delete Employee", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                   Statement st = con.createStatement();
                    ps = con.prepareStatement("delete from school_employees where phone=?");
                 
                     ps.setString(1, phone);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Employee Deleted");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
    
        public void EmployeeManageUni(String op, String name, String fname, String mname, String phone, String dateOfBirth, String gender, String designation, String email, String presentAdd, String status,String ssn) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO uni_employees (employee_name,father,mother,phone,date_of_birth, gender, designation, email, address,status,ssn) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, phone);
                ps.setString(5, dateOfBirth);
                ps.setString(6, gender);
                ps.setString(7, designation);
                ps.setString(8, email);
                ps.setString(9, presentAdd);     
                ps.setString(10, status);
                ps.setString(11, ssn);
  

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Employee Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {

            try {
                con = MyConnection.getConnection();
                Statement st = con.createStatement();

                String sql = "update uni_employees set employee_name=?, father=?, mother=?,date_of_birth=?,gender=?,designation=?,email=?,address=?,status=?,ssn=? where phone=?";

                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, dateOfBirth);
                ps.setString(5, gender);
                ps.setString(6, designation);
                ps.setString(7, email);
                ps.setString(8, presentAdd);           
                ps.setString(9, status); 
                ps.setString(10, ssn); 
                ps.setString(11, phone);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

         if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Details of Employee Salary will also be deleted", "Delete Employee", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                   Statement st = con.createStatement();
                    ps = con.prepareStatement("delete from uni_employees where phone=?");
                 
                     ps.setString(1, phone);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Employee Deleted");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

    public boolean isPhoneExistSchool(String phone) {

        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM school_employees WHERE phone = ?");
            ps.setString(1, phone);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }
    
     public boolean isPhoneExistUni(String phone) {

        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM uni_employees WHERE phone = ?");
            ps.setString(1, phone);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }

    public void mobileExitSchool(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM school_employees WHERE phone ='" + number + "'");

            if (rs.next()) {
                ManageEmp.school_status.removeAllItems();
                ManageEmp.school_name.setText(rs.getString(2));
                ManageEmp.school_father.setText(rs.getString(3));
                ManageEmp.school_mother.setText(rs.getString(4));
                ManageEmp.school_phone.setText(rs.getString(5));
                ManageEmp.school_dateOfBirth.setDate(rs.getDate(6));
                ManageEmp.school_designation.setSelectedItem(rs.getString(8));
                ManageEmp.school_email.setText(rs.getString(9));
                ManageEmp.school_presentAdd.setText(rs.getString(10));
                ManageEmp.school_ssn.setText(rs.getString(11));

                if (rs.getString(7).equals("male")) {
                    ManageEmp.school_male.setSelected(true);
                    ManageEmp.school_female.setSelected(false);
                } else {
                    ManageEmp.school_female.setSelected(true);
                    ManageEmp.school_male.setSelected(false);
                }

                if (rs.getString(12).equals("Working")) {
                    ManageEmp.school_status.addItem("Working");
                    ManageEmp.school_status.addItem("Not Working");
                } else {
                    ManageEmp.school_status.addItem("Not Working");
                    ManageEmp.school_status.addItem("Working");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void mobileExitUni(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM uni_employees WHERE phone ='" + number + "'");

            if (rs.next()) {
                ManageEmp.uni_status.removeAllItems();
                ManageEmp.uni_name.setText(rs.getString(2));
                ManageEmp.uni_father.setText(rs.getString(3));
                ManageEmp.uni_mother.setText(rs.getString(4));
                ManageEmp.uni_phone.setText(rs.getString(5));
                ManageEmp.uni_dateOfBirth.setDate(rs.getDate(6));
                ManageEmp.uni_designation.setSelectedItem(rs.getString(8));
                ManageEmp.uni_email.setText(rs.getString(9));
                ManageEmp.uni_presentAdd.setText(rs.getString(10));
                ManageEmp.uni_ssn.setText(rs.getString(11));
                if (rs.getString(7).equals("male")) {
                    ManageEmp.uni_male.setSelected(true);
                    ManageEmp.uni_female.setSelected(false);
                } else {
                    ManageEmp.uni_female.setSelected(true);
                    ManageEmp.uni_male.setSelected(false);
                }

                if (rs.getString(12).equals("Working")) {
                    ManageEmp.uni_status.addItem("Working");
                    ManageEmp.uni_status.addItem("Not Working");
                } else {
                    ManageEmp.uni_status.addItem("Not Working");
                    ManageEmp.uni_status.addItem("Working");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Emp.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
