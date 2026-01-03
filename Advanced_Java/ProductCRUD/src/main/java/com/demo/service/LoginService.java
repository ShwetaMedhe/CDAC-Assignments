package com.demo.service;

import com.demo.beans.MyUser;

public interface LoginService {

	MyUser validateUser(String uname, String pass);

	boolean updatePassword(String uname, String newPass);

	boolean addUser(String uname, String email, String role, String pass);

}
