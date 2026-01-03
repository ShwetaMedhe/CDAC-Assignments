package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.dao.ProductDao;

public class LoginServiceImpl implements LoginService{
	private LoginDao ldao;
	
	public LoginServiceImpl() {
		ldao=new LoginDaoImpl();
	}

	@Override
	public MyUser validateUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return ldao.checkUser(uname,pass);
	}

	@Override
	public boolean updatePassword(String uname, String newPass) {
		return ldao.updatePassword(uname,newPass);
	}

	@Override
	public boolean addUser(String uname, String email, String role, String pass) {
		// TODO Auto-generated method stub
		return ldao.addUser(uname,email,role, pass);
	}
	

}
