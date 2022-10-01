/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moirottoiec.DAL;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import moirottoiec.DTO.Lecturer;
/**
 *
 * @author anhph
 */
public class LecturerDAL extends DatabaseManager {
    public LecturerDAL(){
        super();
        ConnectDB();
    }
    
    public ResultSet getAllLecturer(){
        ResultSet rs=null;
        try {
            String sql = "SELECT * FROM person WHERE HireDate > 0";
            Connection conn = getConn();
            Statement stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LecturerDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public int addLecturer (Lecturer lecturer){
        String sql = "INSERT INTO person(LastName, FirstName, HireDate) VALUES(?, ?, ?)";
        int result = 0;
        try{
            Connection conn = getConn();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, lecturer.getLastName());
            st.setString(2, lecturer.getFirstName());
            st.setDate(3, lecturer.getHireDate());
            result = st.executeUpdate();
        } catch(SQLException ex){
            Logger.getLogger(LecturerDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public int updateLecturer (Lecturer lecturer){
        String sql = "UPDATE person SET LastName = ?, FirstName = ?, HireDate = ? WHERE personID = ?";
        int result = 0;
        try{
            Connection conn = getConn();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, lecturer.getLastName());
            st.setString(2, lecturer.getFirstName());
            st.setDate(3, lecturer.getHireDate());
            st.setInt(4, lecturer.getPersonID());
            result = st.executeUpdate();
        } catch(SQLException ex){
            Logger.getLogger(LecturerDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
    public int deleteLecturer (int personID){
        String sql = "DELETE FROM person WHERE PersonID = ?";
        int result = 0;
        try{
            Connection conn = getConn();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, personID);
            result = st.executeUpdate();
        } catch(SQLException ex){
            Logger.getLogger(LecturerDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
