package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hinal
 */

public class EmpSalary {

    public void empSalarySchool(String op, String phone, String salary, String month, String payDate) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO school_employees_salary (phone,salary, payment_month, payment_date) VALUES (?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, phone);
                ps.setString(2, salary);
                ps.setString(3, month);
                ps.setString(4, payDate);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Employee Payment Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void empSalaryUni(String op, String phone, String salary, String month, String payDate) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO uni_employees_salary (phone,salary, payment_month, payment_date) VALUES (?,?,?,?)";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, phone);
                ps.setString(2, salary);
                ps.setString(3, month);
                ps.setString(4, payDate);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Employee Payment Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void getTableSchool(String phone, JTable t) {
        DefaultTableModel table = (DefaultTableModel) t.getModel();
        table.setRowCount(0);
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from school_employees_salary where phone='" + phone + "' order by id desc";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                table.addRow(new Object[]{rs.getString(4), rs.getString(3), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getTableUni(String phone, JTable t) {
        DefaultTableModel table = (DefaultTableModel) t.getModel();
        table.setRowCount(0);
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from uni_employees_salary where phone='" + phone + "' order by id desc";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                table.addRow(new Object[]{rs.getString(4), rs.getString(3), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mobileExitSchool(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM school_employees WHERE phone ='" + number + "' and status='Working'";
            ResultSet rs = st.executeQuery(sql);

            Calendar c = Calendar.getInstance();
            int month = c.get(Calendar.MONTH);
            String year = String.valueOf(c.get(Calendar.YEAR));

            String paymentDate = (getMonth(month+1) + "-" + year);

            if (rs.next()) {

                UI.EmpSal.school_payment.setEnabled(true);
                UI.EmpSal.school_name.setText(rs.getString(2));
                UI.EmpSal.school_phone.setText(rs.getString(5));
                UI.EmpSal.school_designation.setText(rs.getString(8));
                UI.EmpSal.school_email.setText(rs.getString(9));
                UI.EmpSal.school_month.setText(paymentDate);

                if (rs.getString(8).equals("Accounting")) {
                    UI.EmpSal.school_salary.setText("$650");
                } else if (rs.getString(8).equals("Chef")) {
                    UI.EmpSal.school_salary.setText("$600");
                } else if (rs.getString(8).equals("Electrician")) {
                    UI.EmpSal.school_salary.setText("$550");
                } else if (rs.getString(8).equals("Housekeeping")) {
                    UI.EmpSal.school_salary.setText("$500");
                } else {
                    UI.EmpSal.school_salary.setText("$700");
                }

                String sql1 = "SELECT * FROM school_employees_salary inner join school_employees where school_employees.status='Working' and school_employees_salary.payment_month='" + paymentDate + "' and school_employees_salary.phone='" + number + "' and school_employees.phone='" + number + "'";
                rs = st.executeQuery(sql1);

                if (rs.next()) {
                    UI.EmpSal.school_payment.setEnabled(false);

                    JOptionPane.showMessageDialog(null, "Already payment");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mobileExitUni(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM uni_employees WHERE phone ='" + number + "' and status='Working'";
            ResultSet rs = st.executeQuery(sql);

            Calendar c = Calendar.getInstance();
            int month = c.get(Calendar.MONTH);
            String year = String.valueOf(c.get(Calendar.YEAR));

            String paymentDate = (getMonth(month+1) + "-" + year);

            if (rs.next()) {

                UI.EmpSal.uni_payment.setEnabled(true);
                UI.EmpSal.uni_name.setText(rs.getString(2));
                UI.EmpSal.uni_phone.setText(rs.getString(5));
                UI.EmpSal.uni_designation.setText(rs.getString(8));
                UI.EmpSal.uni_email.setText(rs.getString(9));
                UI.EmpSal.uni_month.setText(paymentDate);

                if (rs.getString(8).equals("Accounting")) {
                    UI.EmpSal.uni_salary.setText("$650");
                } else if (rs.getString(8).equals("Chef")) {
                    UI.EmpSal.uni_salary.setText("$600");
                } else if (rs.getString(8).equals("Electrician")) {
                    UI.EmpSal.uni_salary.setText("$550");
                } else if (rs.getString(8).equals("Housekeeping")) {
                    UI.EmpSal.uni_salary.setText("$500");
                } else {
                    UI.EmpSal.uni_salary.setText("$700");
                }

                String sql1 = "SELECT * FROM uni_employees_salary inner join uni_employees where uni_employees.status='Working' and uni_employees_salary.payment_month='" + paymentDate + "' and uni_employees_salary.phone='" + number + "' and uni_employees.phone='" + number + "'";
                rs = st.executeQuery(sql1);

                if (rs.next()) {
                    UI.EmpSal.uni_payment.setEnabled(false);

                    JOptionPane.showMessageDialog(null, "Already payment");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Employee doesn't exist");
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getMonth(int month) {
        String monthName = "";
        switch (month) {
            case 1 -> monthName = "December";
            case 2 -> monthName = "January";
            case 3 -> monthName = "February";
            case 4 -> monthName = "March";
            case 5 -> monthName = "April";
            case 6 -> monthName = "May";
            case 7 -> monthName = "June";
            case 8 -> monthName = "July";
            case 9 -> monthName = "August";
            case 10 -> monthName = "September";
            case 11 -> monthName = "October";
            case 12 -> monthName = "November";
        }
        return monthName;
    }
}
