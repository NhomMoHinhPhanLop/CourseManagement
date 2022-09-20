/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.BLL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import moirottoiec.DAL.UserDAL;
import moirottoiec.DTO.User;
/**
 *
 * @author Admin
 */
public class UserBLL {
    private User user=null;
    public UserBLL() {
    }

    public User getUser() {
        return user;
    }
    
    public String Login(String username,String password){
        UserDAL userDAL = new UserDAL();
        String message =null;
        ResultSet rs=userDAL.getUser(username);
        try {
            while(rs.next()) {
                user = new User(rs.getInt("UserID"), 
                        rs.getInt("PersonID"), rs.getString("Username"),
                        rs.getString("Password"));
            }
            if(user!=null){
                if(!password.equals(user.getPassword())){
                    message="Mật khẩu không đúng";
                    user=null;
                }
            }
            else{
                message="Tài khoản không tồn tại";
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(UserBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return message;

    }
}
