/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import DTOS.UserDTO;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author peter
 */
public interface UserRepository {
    
    public UserDTO createUser(UserDTO userDTO) throws WebApplicationException;
    
    
}
