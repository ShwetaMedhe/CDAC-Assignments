package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement insProd, deleteById,modifyById,findById;
	
	static {
		try {
			conn=DBUtil.getMyConnection();
			insProd=conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
			deleteById=conn.prepareStatement("delete from myproduct where pid=?");
			modifyById=conn.prepareStatement("update myproduct set qty=?,price=? where pid=?");
			findById=conn.prepareStatement("select * from myproduct where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public boolean save(Product p) {
		try {
			insProd.setInt(1, p.getPid());
			insProd.setString(2, p.getPname());
			insProd.setInt(3, p.getQty());
			insProd.setDouble(4, p.getPrice());
			insProd.setDate(5, java.sql.Date.valueOf(p.getLdt()));
			int n=insProd.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean removeById(int id) {
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
	@Override
	public boolean modifyById(int id, int qty, double price) {
		// TODO Auto-generated method stub
		try {
			modifyById.setInt(1,qty);
			modifyById.setDouble(2, price);
			modifyById.setInt(3, id);
			int n=modifyById.executeUpdate();
			if(n>0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	@Override
	public Product findById(int id) {
		Product p=null;
		try {
			findById.setInt(1, id);
			ResultSet rs=findById.executeQuery();
			if(rs.next()) {
				if(rs.getDate(5)!=null) {
					p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate());
				}else {
					p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),null);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
}
