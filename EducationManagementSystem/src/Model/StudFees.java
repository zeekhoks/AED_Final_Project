package Model;


import Model.MyConnection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import UI.StudentFees;

/**
 *
 * @author Hinal
 */

public class StudFees {

    public void feesManageSchool(String op,String phone, String month,String fees, String paymentDay) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO school_students_fees (phone,payment_month,fees,payment_date) VALUES (?,?,?,?)";

            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, phone);
                ps.setString(2, month);
                ps.setString(3, fees);
                ps.setString(4, paymentDay);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Payment Successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(StudFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
           public void feesManageUni(String op,String phone, String month,String fees, String paymentDay) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;

        if (op == "insert") {
            String sql = "INSERT INTO uni_students_fees (phone,payment_month,fees,payment_date) VALUES (?,?,?,?)";

            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, phone);
                ps.setString(2, month);
                ps.setString(3, fees);
                ps.setString(4, paymentDay);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Payment Successfully");
                }

            } catch (SQLException ex) {
                Logger.getLogger(StudFees.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void mobileExitSchool(String phone) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM school_students WHERE phone ='" + phone + "' and living_status='Living'";
            ResultSet rs = st.executeQuery(sql);

            Calendar c = Calendar.getInstance();
            int month = c.get(Calendar.MONTH);
            String year = String.valueOf(c.get(Calendar.YEAR));

            String paymentDate = (getMonth(month+1) + "-" + year);

            if (rs.next()) {
                StudentFees.school_payment.setEnabled(true);
                StudentFees.school_name.setText(rs.getString(2));
                StudentFees.school_email.setText(rs.getString(7));
                StudentFees.school_phone.setText(rs.getString(8));
                StudentFees.school_program.setText(rs.getString(9));
                StudentFees.school_uni.setText(rs.getString(10));
                StudentFees.school_roomNumber.setText(rs.getString(12));
                StudentFees.school_month.setText(paymentDate);

                if (rs.getString(9).equals("Bachelor Programs")) {
                    StudentFees.school_dorFees.setText("$200");
                } else if (rs.getString(9).equals("Master Programs")) {
                    StudentFees.school_dorFees.setText("$250");
                } else {
                    StudentFees.school_dorFees.setText("$300");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student doesn't exist");
            }

            String sql1 = "SELECT * FROM school_students_fees inner join school_students where school_students.living_status='Living' and school_students_fees.payment_month='" + paymentDate + "' and school_students_fees.phone='" + phone + "' and school_students.phone='" + phone + "'";
            rs = st.executeQuery(sql1);

            if (rs.next()) {
                StudentFees.school_payment.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Already payment");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudFees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mobileExitUni(String phone) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM uni_students WHERE phone ='" + phone + "' and living_status='Living'";
            ResultSet rs = st.executeQuery(sql);

            Calendar c = Calendar.getInstance();
            int month = c.get(Calendar.MONTH);
            String year = String.valueOf(c.get(Calendar.YEAR));

            String paymentDate = (getMonth(month+1) + "-" + year);

            if (rs.next()) {
                StudentFees.uni_payment.setEnabled(true);
                StudentFees.uni_name.setText(rs.getString(2));
                StudentFees.uni_email.setText(rs.getString(7));
                StudentFees.uni_phone.setText(rs.getString(8));
                StudentFees.uni_program.setText(rs.getString(9));
                StudentFees.uni_pass.setText(rs.getString(15));
                StudentFees.uni_roomNumber.setText(rs.getString(12));
                StudentFees.uni_month.setText(paymentDate);

                if (rs.getString(9).equals("Bachelor Programs")) {
                    StudentFees.uni_dorFees.setText("$200");
                } else if (rs.getString(9).equals("Master Programs")) {
                    StudentFees.uni_dorFees.setText("$250");
                } else {
                    StudentFees.uni_dorFees.setText("$300");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student doesn't exist");
            }

            String sql1 = "SELECT * FROM uni_students_fees inner join uni_students where uni_students.living_status='Living' and uni_students_fees.payment_month='" + paymentDate + "' and uni_students_fees.phone='" + phone + "' and uni_students.phone='" + phone + "'";
            rs = st.executeQuery(sql1);

            if (rs.next()) {
                StudentFees.uni_payment.setEnabled(false);

                JOptionPane.showMessageDialog(null, "Already payment");
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudFees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getTableSchool(String phone, JTable t) {
        DefaultTableModel table = (DefaultTableModel) t.getModel();
        table.setRowCount(0);
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from school_students_fees where phone='" + phone + "' order by id desc";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                table.addRow(new Object[]{rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudFees.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getTableUni(String phone, JTable t) {
        DefaultTableModel table = (DefaultTableModel) t.getModel();
        table.setRowCount(0);
        try {
            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from int_students_fees where phone='" + phone + "' order by id desc";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                table.addRow(new Object[]{rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudFees.class.getName()).log(Level.SEVERE, null, ex);
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
