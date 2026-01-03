package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao {
	static Connection conn=null;
	static PreparedStatement seluser,updatepass,insuser;
	static {
		
		try {
			conn=DBUtil.getMyConnection();
			seluser =conn.prepareStatement("select uname,email,role from myuser where uname=? and password =?");
			updatepass=conn.prepareStatement("update myuser set password=? where uname=?");
			insuser=conn.prepareStatement("insert into myuser(uname,email,role, password) values(?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public MyUser checkUser(String uname, String pass) {
		try {
			seluser.setString(1, uname);
			seluser.setString(2, pass);
			ResultSet rs=seluser.executeQuery();
			if(rs.next()) {
				MyUser user=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean updatePassword(String uname, String newPass) {
		try {
			updatepass.setString(1, newPass);
			updatepass.setString(2, uname);
			int n=updatepass.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}


	@Override
	public boolean addUser(String uname, String email, String role, String pass) {
		try {
			insuser.setString(1, uname);
			insuser.setString(2, email);
			insuser.setString(3, role);
			insuser.setString(4, pass);
			int n= insuser.executeUpdate();
			return n>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
