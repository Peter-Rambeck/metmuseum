/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOS;

import entities.User;

/**
 *
 * @author peter
 */
public class UserDTO {
    
    // private Long ID; 
    private String userName;
    private String userPass;

    public UserDTO(String userName, String userPass) {
       
        this.userName = userName;
        this.userPass = userPass;
    }
        
    public UserDTO(User user) {
        this.userName = user.getUserName();
        this.userPass = user.getUserPass();
        // this.ID = user.getId();
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

//    public Long getID() {
//        return ID;
//    }
//
//    public void setID(Long ID) {
//        this.ID = ID;
//    }

   
    
    
}
