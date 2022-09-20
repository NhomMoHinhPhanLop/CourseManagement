package moirottoiec.DAL;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import moirottoiec.DAL.DatabaseManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class UserDAL extends DatabaseManager {

    public UserDAL() {
        super();
        ConnectDB();
        
    }
    public ResultSet getUser(String username){
        ResultSet rs=null;
        try {
            String sql = "SELECT * FROM user WHERE Username=?";
            Connection conn =getConn();
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1, username);
            rs=stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
}
