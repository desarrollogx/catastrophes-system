package com.ssacn.main;

import com.ssacn.Controller.JpaUserController;
import com.ssacn.Entity.User;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	/*	User u=new User();
		u.setEmail("abc@abc");
		u.setLogin("nico");
		u.setName("Nicolas");
		u.setUserId(1);
		JpaUserController controller=new JpaUserController();
		controller.create(u);*/
		
		JpaUserController controller=new JpaUserController();	
		User user=controller.findUser(1);	
		System.out.print("user:"+user.getName());
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
