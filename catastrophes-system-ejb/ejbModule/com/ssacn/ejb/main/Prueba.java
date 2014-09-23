package com.ssacn.ejb.main;

import com.ssacn.ejb.business.UserManager;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager manager=new UserManager();
		String login="usr";
		System.out.print("****"+manager.findUserByLogin(login).getName());
	}

}
