/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moirottoiec.BLL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import moirottoiec.DAL.LecturerDAL;
import moirottoiec.DTO.Lecturer;

/**
 *
 * @author anhph
 */
public class LecturerBLL {
    LecturerDAL lecDAL;
    
    public LecturerBLL(){
        lecDAL = new LecturerDAL();
    }
    
    
    public Vector<Lecturer> getAllLecturer(){
        ResultSet rs = lecDAL.getAllLecturer();
        Vector<Lecturer> arr = new Vector<Lecturer>();
        try{
            while(rs.next()){
                Lecturer lec = new Lecturer();
                lec.setPersonID(rs.getInt("PersonID"));
                lec.setLastName(rs.getString("LastName"));
                lec.setFirstName(rs.getString("FirstName"));
                lec.setHireDate(rs.getDate("HireDate")); 
                arr.add(lec); 
            }
        } catch (SQLException ex) {
        System.out.println(ex);
        }
        return arr;
    }
    
    public void addLecturer(Lecturer lecturer){
        lecDAL.addLecturer(lecturer);
    }
    
    public void deleteLecturer(int personID){
        lecDAL.deleteLecturer(personID);
    }
}
