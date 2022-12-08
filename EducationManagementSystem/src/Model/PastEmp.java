package Model;


import Model.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hinal
 */

public class PastEmp {

    public void EmployeesTableSchool(JTable table, String valueToSearch) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM school_employees WHERE CONCAT (phone)LIKE ? and school_employees.status='Not Working'");
            ps.setString(1, "%" + valueToSearch + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[11];

                row[0] = rs.getString(2);
                row[1] = rs.getString(3);
                row[2] = rs.getString(4);
                row[3] = rs.getString(5);
                row[4] = rs.getString(6);
                row[5] = rs.getString(7);
                row[6] = rs.getString(8);
                row[7] = rs.getString(9);
                row[8] = rs.getString(10);
                row[9] = rs.getString(11);
                row[10] = rs.getString(12);

                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PastEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void EmployeesTableUni(JTable table, String valueToSearch) {

        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM uni_employees WHERE CONCAT (phone)LIKE ? and uni_employees.status='Not Working'");
            ps.setString(1, "%" + valueToSearch + "%");

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;

            while (rs.next()) {
                row = new Object[11];

                row[0] = rs.getString(2);
                row[1] = rs.getString(3);
                row[2] = rs.getString(4);
                row[3] = rs.getString(5);
                row[4] = rs.getString(6);
                row[5] = rs.getString(7);
                row[6] = rs.getString(8);
                row[7] = rs.getString(9);
                row[8] = rs.getString(10);
                row[9] = rs.getString(11);
                row[10] = rs.getString(12);
                

                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PastEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
