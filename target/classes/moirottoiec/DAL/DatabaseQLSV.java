/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.DAL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Binh PC
 */
public class DatabaseQLSV {
    public static Connection openConnection()throws Exception{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl ="jdbc:sqlserver://localhost;database=QLSV;";
        String dbusername = "sa";
        String password = "123";
        Connection con = DriverManager.getConnection(connectionUrl, dbusername, password);
        
        return con; 
    }
}
