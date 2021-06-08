package facades;

import DTOS.UserDTO;
import entities.Role;
import entities.User;
import entities.UserRepository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import security.errorhandling.AuthenticationException;

/**
 * @author lam@cphbusiness.dk
 */
public class UserFacade implements UserRepository {

    private static EntityManagerFactory emf;
    private static UserFacade instance;

    private UserFacade() {
    }

    /**
     *
     * @param _emf
     * @return the instance of this facade.
     */
    public static UserFacade getUserFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new UserFacade();
        }
        return instance;
    }
       
    
    @Override
    public UserDTO createUser(UserDTO userDTO) {
   
    EntityManager em = emf.createEntityManager();
    User user = new User(userDTO.getName(), userDTO.getUserPass());
    
    try {
        em.getTransaction().begin();
        Role role = em.find(Role.class, "user");
        user.addRole(role);
        em.persist(user);
        em.getTransaction().commit();
        } finally {
        em.close();
    }
        
       
        
    return new UserDTO(user);
    }
    
    

    public User getVeryfiedUser(String username, String password) throws AuthenticationException {
        EntityManager em = emf.createEntityManager();
        User user;
        try {
            user = em.find(User.class, username);
            if (user == null || !user.verifyPassword(password)) {
                throw new AuthenticationException("Invalid user name or password");
            }
        } finally {
            em.close();
        }
        return user;
    }

}
