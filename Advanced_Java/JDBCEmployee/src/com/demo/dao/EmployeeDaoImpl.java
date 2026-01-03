package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static Connection conn;
	static PreparedStatement insEmp,deleteById;
	
	static {
		try {
			conn=DBUtil.getMyConnection();
			insEmp=conn.prepareStatement("insert into employee values(?,?,?,?)");
			deleteById=conn.prepareStatement("delete from employee where id=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean save(Employee e) {
		
		try {
			insEmp.setInt(1, e.getEid());
			insEmp.setString(2, e.getEname());
			insEmp.setDouble(3, e.getSal());
			insEmp.setDate(4, java.sql.Date.valueOf(e.getJdt()));
			int n = insEmp.executeUpdate();
			return n>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		try {
			deleteById.setInt(1, id);
			int n=deleteById.executeUpdate();
			if(n>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
