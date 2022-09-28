/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moirottoiec.DAL;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author anhph
 */
public class LecturerDAL extends DatabaseManager {
    public LecturerDAL(){
        super();
        ConnectDB();
    }
    
    public ResultSet getAllGiangvien(){
        ResultSet rs=null;
        try {
            String sql = "SELECT * FROM person WHERE HireDate > 0";
            Connection conn = getConn();
            Statement stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    
}
