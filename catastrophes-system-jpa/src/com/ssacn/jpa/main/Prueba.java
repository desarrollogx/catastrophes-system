package com.ssacn.jpa.main;

import com.ssacn.jpa.Controller.JpaUserController;
import com.ssacn.jpa.Entity.User;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		User u=new User();
		u.setEmail("abc@abc");
		u.setLogin("usr");
		u.setName("Usuario");
		//u.setUserId(1);
		JpaUserController controller=new JpaUserController();
		controller.create(u);
		
		//JpaUserController controller=new JpaUserController();	
		//User user=controller.findUser(1);	
		User user=controller.findUserByLogin("usr");
		System.out.print("user:"+user.getName());
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
