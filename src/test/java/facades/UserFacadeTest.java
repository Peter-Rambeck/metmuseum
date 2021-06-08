/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import DTOS.UserDTO;
import entities.User;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import utils.EMF_Creator;

/**
 *
 * @author peter
 */

public class UserFacadeTest {
    
    private static EntityManagerFactory emf;
    private static UserFacade facade;
    
    public UserFacadeTest() {
    }
    
    
    @BeforeEach
    public void setUp() {
        
        emf = EMF_Creator.createEntityManagerFactoryForTest();
        facade = UserFacade.getUserFacade(emf);
        
    }
    
    @AfterEach
    public void tearDown() {
    }

  
    @Test
    public void testCreateUser() {
        
        User user1 = new User("Hansemanden", "1234");
        User user2 = new User("Gummisko", "1234");
        UserDTO userDTO = new UserDTO(user1);
        UserDTO userDTO2 = new UserDTO(user2);
        
        UserDTO x = facade.createUser(userDTO);
        UserDTO y = facade.createUser(userDTO2);
        assertEquals("Hansemanden", x.getName());
      
        
        
//        System.out.println("createUser");
//        UserDTO userDTO = null;
//        UserFacade instance = null;
//        UserDTO expResult = null;
//        UserDTO result = instance.createUser(userDTO);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testGetVeryfiedUser() throws Exception {
//        System.out.println("getVeryfiedUser");
//        String username = "";
//        String password = "";
//        UserFacade instance = null;
//        User expResult = null;
//        User result = instance.getVeryfiedUser(username, password);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }
    
}
