/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.DAL;

import edu.poly.Lab.helper.DatabaseHelper;
import edu.poly.Lab.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Binh PC
 */
public class StudentDAL {
    public boolean insert (Student stud) throws Exception{
        String sql = "insert into sinhvien(masv, hoten, email, sodt, gioitinh, diachi) values(?,?,?,?,?,?)" ;
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
            pstmt.setString(1, stud.getMaSV());
            pstmt.setString(2, stud.getHoTen());
            pstmt.setString(3, stud.getEmail());
            pstmt.setString(4, stud.getSoDT());
            pstmt.setInt(5, stud.getGioiTinh());
            pstmt.setString(6, stud.getDiaChi());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean update (Student stud) throws Exception{
        String sql = "update sinhvien set hoten = ?, email = ?, sodt = ?, gioitinh = ?, diachi = ? " + "where masv = ?" ;
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
            pstmt.setString(6, stud.getMaSV());
            pstmt.setString(1, stud.getHoTen());
            pstmt.setString(2, stud.getEmail());
            pstmt.setString(3, stud.getSoDT());
            pstmt.setInt(4, stud.getGioiTinh());
            pstmt.setString(5, stud.getDiaChi());
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete (String maSV) throws Exception{
        String sql = "delete from sinhvien where masv = ?" ;
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
         
            pstmt.setString(1, maSV);
           
            
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public Student findById (String maSV) throws Exception{
        String sql = "select * from sinhvien where masv = ?" ;
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
            pstmt.setString(1, maSV);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                Student stud = new Student();
                stud.setMaSV(rs.getString("maSV"));
                stud.setHoTen(rs.getString("hoTen"));
                stud.setEmail(rs.getString("email"));
                stud.setSoDT(rs.getString("soDT"));
                stud.setGioiTinh(rs.getInt("gioitinh"));
                stud.setDiaChi(rs.getString("diachi"));

                return stud;

            }
            
            return null;
        }
    }
    
    public List<Student> findAll () throws Exception{
        String sql = "select * from sinhvien" ;
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
          try (ResultSet rs = pstmt.executeQuery()){
              List<Student> list = new ArrayList<>();
              while (rs.next()){
                  Student stud = new Student();
                  stud.setMaSV(rs.getString("maSV"));
                stud.setHoTen(rs.getString("hoTen"));
                stud.setEmail(rs.getString("email"));
                stud.setSoDT(rs.getString("soDT"));
                stud.setGioiTinh(rs.getInt("gioitinh"));
                stud.setDiaChi(rs.getString("diachi"));
                list.add(stud);
              }
          return list;
        }
    }
    }
}
