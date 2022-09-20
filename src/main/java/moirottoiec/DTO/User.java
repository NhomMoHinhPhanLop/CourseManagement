/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moirottoiec.DTO;

/**
 *
 * @author Admin
 */
public class User {
    private int UserID;
    private int PersonID;
    private String username;
    private String password;

    public User() {
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;
    }
    
    public User(int UserID, int PersonID, String username, String password) {
        this.UserID = UserID;
        this.PersonID = PersonID;
        this.username = username;
        this.password = password;
    }

    public int getPersonID() {
        return PersonID;
    }
    

    public int getUserID() {
        return UserID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    
}
