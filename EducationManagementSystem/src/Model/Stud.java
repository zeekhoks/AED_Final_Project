package Model;


import Model.MyConnection;
import UI.ManageStudents;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hinal
 */

public class Stud {

    public void SchoolStuManage(String op, String name, String fname, String mname, String email, String phone, String programs, String uni, String uid, String roomNumber, String date, String gender, String status, String add,String ssn) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        PreparedStatement ps1;

        if (op == "insert") {
            String sql = "INSERT INTO school_students (student_name, father_name, mother_name,date_of_birth,gender,email,phone,program_of_study, institute_name,student_id, room_number,living_status,address,ssn) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql1 = "update room set room_status='Booked' where room_number = ?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, date);
                ps.setString(5, gender);
                ps.setString(6, email);
                ps.setString(7, phone);
                ps.setString(8, programs);
                ps.setString(9, uni);
                ps.setString(10, uid);
                ps.setString(11, roomNumber);
                ps.setString(12, status);
                ps.setString(13, add);
                ps.setString(14, ssn);

                ps1 = con.prepareStatement(sql1);
                ps1.setString(1, roomNumber);
                ps1.executeUpdate();

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Student Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {
            try {
                con = MyConnection.getConnection();
                Statement st = con.createStatement();
                if (status.equals("Living")) {
                    st.executeUpdate("update room set room_status='Booked' where room_number='" + roomNumber + "'");
                } else {
                    st.executeUpdate("update room set room_status='Not Booked' where room_number='" + roomNumber + "'");

                }
                if (status.equals("Leaved")) {
                    roomNumber = "";
                }

                ps = con.prepareStatement("update school_students set student_name=?, father_name=?, mother_name=?,date_of_birth=?,gender=?,email=?,program_of_study=?, institute_name=?,student_id=?,living_status=?,room_number=?,address=?, ssn=? where phone=?");
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, date);
                ps.setString(5, gender);
                ps.setString(6, email);
                ps.setString(7, programs);
                ps.setString(8, uni);
                ps.setString(9, uid);
                ps.setString(10, status);
                ps.setString(11, roomNumber);
                ps.setString(12, add);
                ps.setString(13, ssn);
                ps.setString(14, phone);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Details of student payments will also be deleted", "Delete Student", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                    Statement st = con.createStatement();
                    ps = con.prepareStatement("delete from school_students where phone=?");
                    st.executeUpdate("update room set room_status='Not Booked' where room_number='" + roomNumber + "'");

                    ps.setString(1, phone);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Student Deleted");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    public void UniStuManage(String op, String name, String fname, String mname, String email, String phone, String programs, String uni, String uid, String roomNumber, String date, String gender, String status, String add, String ssn) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        PreparedStatement ps1;

        if (op == "insert") {
            String sql = "INSERT INTO uni_students (student_name, father_name, mother_name,date_of_birth,gender,email,phone,program_of_study, institute_name,student_id, room_number,living_status,address,ssn) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql1 = "update room set room_status='Booked' where room_number = ?";
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, date);
                ps.setString(5, gender);
                ps.setString(6, email);
                ps.setString(7, phone);
                ps.setString(8, programs);
                ps.setString(9, uni);
                ps.setString(10, uid);
                ps.setString(11, roomNumber);
                ps.setString(12, status);
                ps.setString(13, add);
                ps.setString(14, ssn);
               

                ps1 = con.prepareStatement(sql1);
                ps1.setString(1, roomNumber);
                ps1.executeUpdate();

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Student Added Successfully");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (op == "update") {
            try {
                con = MyConnection.getConnection();
                Statement st = con.createStatement();
                if (status.equals("Living")) {
                    st.executeUpdate("update room set room_status='Booked' where room_number='" + roomNumber + "'");
                } else {
                    st.executeUpdate("update room set room_status='Not Booked' where room_number='" + roomNumber + "'");

                }
                if (status.equals("Leaved")) {
                    roomNumber = "";
                }

                ps = con.prepareStatement("update uni_students set student_name=?, father_name=?, mother_name=?,date_of_birth=?,gender=?,email=?,program_of_study=?, institute_name=?,student_id=?,living_status=?,room_number=?,address=?,ssn=? where phone=?");
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, mname);
                ps.setString(4, date);
                ps.setString(5, gender);
                ps.setString(6, email);
                ps.setString(7, programs);
                ps.setString(8, uni);
                ps.setString(9, uid);
                ps.setString(10, status);
                ps.setString(11, roomNumber);
                ps.setString(12, add);
                ps.setString(13, ssn);              
                ps.setString(14, phone);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Updated Successfully");

                }

            } catch (SQLException ex) {
                Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (op == "delete") {
            int YesOrNo = JOptionPane.showConfirmDialog(null, "Details of student payments will also be deleted", "Delete Student", JOptionPane.OK_CANCEL_OPTION, 0);
            if (YesOrNo == JOptionPane.OK_OPTION) {
                try {
                    Statement st = con.createStatement();
                    ps = con.prepareStatement("delete from uni_students where phone=?");
                    st.executeUpdate("update room set room_status='Not Booked' where room_number='" + roomNumber + "'");

                    ps.setString(1, phone);
                    if (ps.executeUpdate() > 0) {
                        JOptionPane.showMessageDialog(null, "Student Deleted");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

    public void mobileExitSchool(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM school_students WHERE phone ='" + number + "'");

            if (rs.next()) {

                ManageStudents.school_status.removeAllItems();
                ManageStudents.school_roomNumber.removeAllItems();
                ManageStudents.school_name.setText(rs.getString(2));
                ManageStudents.school_fName.setText(rs.getString(3));
                ManageStudents.school_mName.setText(rs.getString(4));
                ManageStudents.school_date.setDate(rs.getDate(5));
                ManageStudents.school_email.setText(rs.getString(7));
                ManageStudents.school_phone.setText(rs.getString(8));
                ManageStudents.school_dpro.setSelectedItem(rs.getString(9));
                ManageStudents.school_uni.setText(rs.getString(10));
                ManageStudents.school_uId.setText(rs.getString(11));
                ManageStudents.school_roomNumber.addItem(rs.getString(12));
                ManageStudents.school_add.setText(rs.getString(14));
                ManageStudents.school_ssn.setText(rs.getString(15));

                if (rs.getString(6).equals("male")) {
                    ManageStudents.school_male.setSelected(true);
                    ManageStudents.school_female.setSelected(false);
                } else {
                    ManageStudents.school_female.setSelected(true);
                    ManageStudents.school_male.setSelected(false);
                }

                if (rs.getString(13).equals("Living")) {
                    ManageStudents.school_status.addItem("Living");
                    ManageStudents.school_status.addItem("Leaved");
                } else if (rs.getString(13).equals("Leaved")) {
                    ManageStudents.school_status.addItem("Leaved");
                    ManageStudents.school_status.addItem("Living");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student doesn't exist");
                 ManageStudents.school_status.setSelectedIndex(-1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mobileExitUni(String number) {
        try {

            Connection con = MyConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM uni_students WHERE phone ='" + number + "'");

            if (rs.next()) {

                ManageStudents.uni_status.removeAllItems();
                ManageStudents.uni_roomNumber.removeAllItems();
                ManageStudents.uni_name.setText(rs.getString(2));
                ManageStudents.uni_fName.setText(rs.getString(3));
                ManageStudents.uni_mName.setText(rs.getString(4));
                ManageStudents.uni_date.setDate(rs.getDate(5));
                ManageStudents.uni_email.setText(rs.getString(7));
                ManageStudents.uni_phone.setText(rs.getString(8));
                ManageStudents.uni_dpro.setSelectedItem(rs.getString(9));
                ManageStudents.uni_uni.setText(rs.getString(10));
                ManageStudents.uni_uId.setText(rs.getString(11));
                ManageStudents.uni_roomNumber.addItem(rs.getString(12));
                ManageStudents.uni_add.setText(rs.getString(14));
                ManageStudents.uni_ssn.setText(rs.getString(15));
                

                if (rs.getString(6).equals("male")) {
                    ManageStudents.uni_male.setSelected(true);
                    ManageStudents.uni_female.setSelected(false);
                } else {
                    ManageStudents.uni_female.setSelected(true);
                    ManageStudents.uni_male.setSelected(false);
                }

                if (rs.getString(13).equals("Living")) {
                    ManageStudents.uni_status.addItem("Living");
                    ManageStudents.uni_status.addItem("Leaved");
                } else if (rs.getString(13).equals("Leaved")) {
                    ManageStudents.uni_status.addItem("Leaved");
                    ManageStudents.uni_status.addItem("Living");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Student doesn't exist");
                ManageStudents.uni_status.setSelectedIndex(-1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean isPhoneExist(String phone) {

        boolean isExist = false;
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM school_students WHERE phone = ?");
            ps.setString(1, phone);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                isExist = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Stud.class.getName()).log(Level.SEVERE, null, ex);
        }

        return isExist;
    }
}
