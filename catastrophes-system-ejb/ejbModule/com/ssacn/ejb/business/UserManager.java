package com.ssacn.ejb.business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.ssacn.jpa.Controller.JpaUserController;
import com.ssacn.jpa.Entity.User;

/**
 * Session Bean implementation class UserManager
 */
@Stateless
@LocalBean
public class UserManager {

	private JpaUserController userController;
    /**
     * Default constructor. 
     */
    public UserManager() {
    	userController = new JpaUserController();
    }
    
    public void createUser(User u){
    	userController.create(u);
    }
    
    public User findUserByLogin(String login){
    	return userController.findUserByLogin(login);
    }

}
